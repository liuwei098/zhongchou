package com.yc.atcrowdfunding.vo;



//第三方依赖，以下注解生成set get方法

public class Result {
	private int code;
	private String message;
	private Object obj;
	private int page;   //当前页数
	private int pageSize;  //每页大小
	private int total;     //总记录数
	private int totalPage; //总页数
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	@Override
	public String toString() {
		return "Result [code=" + code + ", message=" + message + ", obj=" + obj + ", page=" + page + ", pageSize="
				+ pageSize + ", total=" + total + ", totalPage=" + totalPage + "]";
	}
	
}
