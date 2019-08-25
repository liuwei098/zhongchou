package com.yc.atcrowdfunding.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	/**
	 * 日期格式化工具类
	 * @param date
	 * @return
	 */
	public static String formatDate(Date date){
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return df.format(date);
	}
}
