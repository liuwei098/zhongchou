package com.yc.atcrowdfunding.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONException;
import org.json.JSONObject;

public class LocationUtil {
	private static String readAll(Reader rd) throws IOException {
	    StringBuilder sb = new StringBuilder();
	    int cp;
	    while ((cp = rd.read()) != -1) {
	      sb.append((char) cp);
	    }
	    return sb.toString();
	  }

	  public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
	    InputStream is = new URL(url).openStream();
	    try {
	      BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
	      String jsonText = readAll(rd);
	      JSONObject json = new JSONObject(jsonText);
	      return json;
	    } finally {
	      is.close();
	     // System.out.println("同时 从这里也能看出 即便return了，仍然会执行finally的！");
	    }
	  }
	  
	  public static Object getLocate(String ip) throws IOException, JSONException {
	   //这里调用百度的ip定位api服务 详见 http://api.map.baidu.com/lbsapi/cloud/ip-location-api.htm
	    JSONObject json = readJsonFromUrl("http://api.map.baidu.com/location/ip?ip="+ip+"&ak=7Ta0s1bG6QGChQ4j1eC7CV8xvpk8ULqT&coor=bd09ll");
	    System.out.println(json);
	    String x=((JSONObject) json.get("content")).get("point").toString().split(",")[1].split(":")[1].split("\"")[1];
	    String y=((JSONObject) json.get("content")).get("point").toString().split(",")[0].split(":")[1].split("\"")[1];
	    System.out.println((JSONObject) json.get("content"));
	   return  getMyLocation(x,y);
	  }
	  public static Object getMyLocation(String x,String y) throws IOException, JSONException{
		  JSONObject json = readJsonFromUrl(("http://api.map.baidu.com/reverse_geocoding/v3/?ak=7Ta0s1bG6QGChQ4j1eC7CV8xvpk8ULqT&output=json&coordtype=wgs84ll&location="+y+","+x+" "));
		  System.out.println(json.getJSONObject("result").toString());
		  /**
		   * {"formatted_address":"","business":"","sematic_description":"","cityCode":0,"roads":[],"location":{"lng":39.914889080000094,"lat":74.00002218455094},"poiRegions":[],"pois":[],"addressComponent":{"city_level":2,"country":"","town":"","distance":"","city":"","adcode":"0","country_code_iso":"","country_code_iso2":"","country_code":-1,"province":"","street":"","district":"","street_number":"","direction":""}}
			{"poiRegions":[],"addressComponent":{"distance":"","direction":"","street":"棉联巷","province":"湖南省","adcode":"430408","street_number":"","country_code_iso2":"CN","town":"","country_code_iso":"CHN","district":"蒸湘区","city_level":2,"country_code":0,"city":"衡阳市","country":"中国"},"location":{"lng":112.59555836503623,"lat":26.90059356943844},"cityCode":159,"formatted_address":"湖南省衡阳市蒸湘区棉联巷","pois":[],"sematic_description":"","roads":[],"business":"石坳,莲湖广场,晶珠广场"}
		   */
		  return ((Object) json.getJSONObject("result").toString().split("formatted_address")[1].split(":")[1].split(",")[0].split("\"")[1]);
	  }
	  
	  	public static String getIp(HttpServletRequest request) {
			String ip = request.getHeader("x-forwarded-for");
			if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
				ip = request.getHeader("Proxy-Client-IP");
			}
			if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
				ip = request.getHeader("WL-Proxy-Client-IP");
			}
			if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
				ip = request.getRemoteAddr();
			}
			return ip;
		}
	  	
	  	/**
		 * 根据ip解析地址
		 * @param strIP
		 * @return
		 */
		public static String getAddressByIP(String strIP) {
			String msg = "";
			try {
				URL url = new URL("http://ip.taobao.com/service/getIpInfo.php?ip=" + strIP);
				URLConnection conn = url.openConnection();
				BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
				String line = null;
				StringBuffer result = new StringBuffer();
				while ((line = reader.readLine()) != null) {
					result.append(line);
				}
				reader.close();
	 
				String code = "{\"code\":";
				if ("0".equals(String.valueOf(result.toString().charAt(result.toString().indexOf(code) + code.length())))) {
					String country = ",\"country\":\"";
					msg += getDetail(result.toString(), country);
	 
					String area = ",\"area\":\"";
					msg += getDetail(result.toString(), area);
	 
					String region = ",\"region\":\"";
					msg += getDetail(result.toString(), region);
	 
					String city = ",\"city\":\"";
					msg += getDetail(result.toString(), city);
					System.out.println(city);
				} else {
					msg = "无效查询";
				}
			
			} catch (IOException e) {
				msg = "无效查询";
			}
			return msg;
		}
		/**
		 * 获取相应信息
		 * @param str
		 * @param substr
		 * @return
		 */
		public static String getDetail(String str, String substr) {
			String result = " ";
			int substr_index = str.indexOf(substr) + substr.length();
			while (!"\"".equals(String.valueOf(str.charAt(substr_index)))) {
				result += String.valueOf(str.charAt(substr_index));
				substr_index++;
			}
			return result;
		}


	
	  
	  public static Object getLocation() throws IOException, JSONException{
		  JSONObject json = readJsonFromUrl("http://api.map.baidu.com/location/ip?ak=7Ta0s1bG6QGChQ4j1eC7CV8xvpk8ULqT&coor=bd09ll");
		  return  ((JSONObject) json.get("content")).get("address");
	  }
	  public static void main(String[] args) throws IOException, JSONException {
		 System.out.println(getAddressByIP("192.168.10.171"));
		
	  }
}
