package com.yc.atcrowdfunding.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yc.atcrowdfunding.bean.TPermission;
import com.yc.atcrowdfunding.bean.TUser;
import com.yc.atcrowdfunding.biz.PermissionBiz;



@Controller
public class UserController {
	@Resource
	private PermissionBiz pbiz;
	@RequestMapping("main")
	public String user(TUser user,HttpSession session){
		
		if(session.getAttribute("menus")==null){
			List<TPermission> list=pbiz.findAllMenu();
			session.setAttribute("menus", list);
		}
		return "user/main";
	}
}
