package com.yc.atcrowdfunding.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.atcrowdfunding.bean.TType;
import com.yc.atcrowdfunding.bean.TTypeExample;
import com.yc.atcrowdfunding.dao.TTypeMapper;

@Service
public class ProjectTypeBiz {
	@Resource
	private TTypeMapper tm;
	public TType findByTerm(Integer id){
		TTypeExample example=null;
		if(id!=null){
			example=new TTypeExample();
			example.createCriteria().andIdEqualTo(id);
		}
		List <TType> list= tm.selectByExample(example);
		if(list!=null &&  !list.isEmpty()){
			return list.get(0);
		}
		return null;
	}
}
