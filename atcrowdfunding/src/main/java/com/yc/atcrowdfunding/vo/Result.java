package com.yc.atcrowdfunding.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//第三方依赖，以下注解生成set get方法
@Getter
@Setter
@ToString
public class Result {
	private int code;
	private String message;
	private Object obj;
	private int page;   //当前页数
	private int pageSize;  //每页大小
	private int total;     //总记录数
	private int totalPage; //总页数
	
}
