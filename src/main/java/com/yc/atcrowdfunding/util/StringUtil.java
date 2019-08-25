package com.yc.atcrowdfunding.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class StringUtil {
	public String genOrderId(){
		Date date =new Date();
		SimpleDateFormat df=new SimpleDateFormat("yyMMddHHmmss");
		String str=df.format(date);
		int r=new Random().nextInt(1000);
		return str+r;
	}
	
	
}
