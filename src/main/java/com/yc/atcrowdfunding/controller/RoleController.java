package com.yc.atcrowdfunding.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.atcrowdfunding.biz.RoleBiz;
import com.yc.atcrowdfunding.vo.Result;

@Controller
public class RoleController {
	@Resource
	private RoleBiz rbiz;
	@RequestMapping("role")
	public String role(@RequestParam(defaultValue="1") int pageNum,@RequestParam(defaultValue="5") int pageSize,
			String name,Model model){
		Result result=rbiz.findAll(pageNum, pageSize, name);
		model.addAttribute("result", result);
		return "role/role";
	}
	
	@RequestMapping("role_deleteRole")
	@ResponseBody
	public Result deleteRole(String ids){
		Result result=new Result();
		try{
			//rbiz.deleteById(ids);
			result.setCode(200);
			result.setMessage("删除成功");
		}catch(RuntimeException e){
			e.printStackTrace();
			result.setCode(500);
			result.setMessage("服务器繁忙，稍后再试！！");
		}
		return result;
	}
}
