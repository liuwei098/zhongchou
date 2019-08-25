package com.yc.atcrowdfunding.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;


public class LoginInterceptor implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object action, Exception mav)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object action, ModelAndView mav)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object action) throws Exception {
		
		if(request.getSession().getAttribute("loginUser")==null){
			if(request.getHeader("X-Requested-With")==null){
				response.sendRedirect("index?login");
			}/*else{
				Gson gson=new Gson();
				String json=gson.toJson(new Result(0, "请先登录系统"));
				response.setContentType("application/json;charset=UTF-8");
				response.getWriter().append(json); 
			}*/
			
			return false;
		}
		return true;
	}

}
