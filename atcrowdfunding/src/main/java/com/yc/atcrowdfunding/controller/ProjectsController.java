package com.yc.atcrowdfunding.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yc.atcrowdfunding.bean.TType;
import com.yc.atcrowdfunding.biz.ProjectTypeBiz;
import com.yc.atcrowdfunding.biz.ProjectsBiz;

@Controller
public class ProjectsController {
	@Resource
	private ProjectsBiz pbiz;
	@Resource
	private ProjectTypeBiz tbiz;
	private final String PATH="D:/blog/";
	@RequestMapping("projects")
	private String projects(Model model,@RequestParam(defaultValue="1") Integer id){
		System.out.println(tbiz.findByTerm(id));
		model.addAttribute("projects", tbiz.findByTerm(id));
		model.addAttribute("path",PATH);
		return "front/project/projects";
	}
}
