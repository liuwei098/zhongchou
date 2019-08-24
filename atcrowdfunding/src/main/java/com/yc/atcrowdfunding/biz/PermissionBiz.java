package com.yc.atcrowdfunding.biz;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.annotation.Resource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Service;

import com.yc.atcrowdfunding.bean.TPermission;

import com.yc.atcrowdfunding.dao.TPermissionMapper;


@Service
@MapperScan("com.yc")
public class PermissionBiz {
	@Resource
	private TPermissionMapper tm;
	public List<TPermission> findAllMenu(){
		List<TPermission> root = new ArrayList<TPermission>();
		List<TPermission> childredPermissons = tm.selectByExample(null);
		System.out.println(childredPermissons);
		Map<Integer,TPermission> map = new HashMap<Integer,TPermission>();
		for (TPermission innerTPermission : childredPermissons) {
			map.put(innerTPermission.getId(), innerTPermission);
		}
		for (TPermission TPermission : childredPermissons) { //100
			//通过子查找父
			//子菜单
			TPermission child = TPermission ; //假设为子菜单
			if(child.getPid() == 0 ){
				root.add(TPermission);
			}else{
				//父节点
				TPermission parent = map.get(child.getId());
				parent.getChilds().add(child);
			}
		}
		root.sort( (TPermission p1,TPermission p2)->{return p1.getId()- p2.getId();}  );//lamda表达式 对root进行排序
		return root;

	}
}
