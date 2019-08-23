package com.yc.atcrowdfunding.biz;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Service;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yc.atcrowdfunding.bean.TRole;
import com.yc.atcrowdfunding.bean.TRoleExample;
import com.yc.atcrowdfunding.dao.TRoleMapper;
import com.yc.atcrowdfunding.vo.Result;

@Service
@MapperScan("com.yc")
public class RoleBiz {
	@Resource
	private TRoleMapper trm;
	public Result findAll(int pageNum,int pageSize,String name){
		TRoleExample example=null;
		if(name!=null && !"".equals(name)){
			example=new TRoleExample();
			example.createCriteria().andNameLike("%"+name+"%");
		}
		Page<TRole> page=PageHelper.startPage(pageNum, pageSize);
		List<TRole> list=trm.selectByExample(example);
		Result result=new Result();
		int total=(int) page.getTotal();
		result.setPage(pageNum);
		result.setTotal(total);
		result.setTotalPage(   total%pageSize==0 ? total/pageSize:((total/pageSize)+1) );
		result.setObj(list);
		return result;
	}
	public void deleteById(int id) {
		trm.deleteByPrimaryKey(id);
		
	}
}
