package com.yc.atcrowdfunding.biz;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yc.atcrowdfunding.bean.TRole;
import com.yc.atcrowdfunding.bean.TRoleExample;
import com.yc.atcrowdfunding.dao.TRoleMapper;
import com.yc.atcrowdfunding.vo.Result;

@Service
@MapperScan("com.yc.atcrowdfunding")
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
		//判断当前页删除之后是否没有数据了，如果没有，回到前一页
		if(pageNum!=1){
			if(total%pageSize==0){
				page=PageHelper.startPage(pageNum-1, pageSize);
				list= trm.selectByExample(example);
				total=(int) page.getTotal();
				result.setTotal((int) total);
				result.setPage(pageNum-1);
			}
		}
		result.setTotalPage(   total%pageSize==0 ? total/pageSize:((total/pageSize)+1) );
		result.setObj(list);
		return result;
	}
	
	@Transactional
	public void deleteById(String ids) {
		String s[]=ids.split(",");
		for(String id:s){
			trm.deleteByPrimaryKey(Integer.parseInt(id));
		}
	}
}
