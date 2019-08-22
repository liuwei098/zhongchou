package com.yc.atcrowdfunding.util;

import java.util.UUID;

public class CommonUtil {
	public static String getFilePath(String path){
		return   path+UUID.randomUUID().toString().substring(0,8);
	}
}
