package com.yc.atcrowdfunding.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yc.atcrowdfunding.bean.TPermission;
import com.yc.atcrowdfunding.biz.PermissionBiz;

@Controller

public class PermissionController {
	
	@RequestMapping("permission")
	public String perssionIndex(){
	
		return "permission/permission";
	}
}
