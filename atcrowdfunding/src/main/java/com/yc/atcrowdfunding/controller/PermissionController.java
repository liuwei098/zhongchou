package com.yc.atcrowdfunding.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yc.atcrowdfunding.bean.TPermission;
import com.yc.atcrowdfunding.biz.PermissionBiz;

@Controller

public class PermissionController {
	@Resource
	private PermissionBiz pbiz;
	@RequestMapping("permission")
	public String perssionIndex(Model model,HttpSession session){
		//model.addAttribute("menus", session.getAttribute("menus"));
		return "permission/permission";
	}
}
