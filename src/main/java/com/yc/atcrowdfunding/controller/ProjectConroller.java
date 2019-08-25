package com.yc.atcrowdfunding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProjectConroller {
	@RequestMapping("project")
	private String project(Model model){
		return "front/project/project";
	}
}
