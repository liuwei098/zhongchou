package com.yc.atcrowdfunding.biz;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Service;

import com.yc.atcrowdfunding.bean.TProject;
import com.yc.atcrowdfunding.bean.TProjectExample;
import com.yc.atcrowdfunding.dao.TProjectMapper;
import com.yc.atcrowdfunding.dao.TProjectTypeMapper;

@Service
@MapperScan("com.yc")
public class ProjectsBiz {
	@Resource
	private TProjectMapper tm;
	
	public List<TProject> findByTerm(){
		List<TProject> list = null;
		TProjectExample example=null;
		list=tm.selectByExample(example);
		return list;
	}
}
