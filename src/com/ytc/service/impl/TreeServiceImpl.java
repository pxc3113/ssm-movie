/** 
 * <pre>项目名称:ssm-movie 
 * 文件名称:TreeServiceImpl.java 
 * 包名:com.ytc.service.impl 
 * 创建日期:2022年1月5日上午10:08:53 
 * Copyright (c) 2022,  All Rights Reserved.</pre> 
 */  
package com.ytc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ytc.mapper.MovieTreeMapper;
import com.ytc.model.MovieTree;
import com.ytc.service.TreeService;

/** 
 * <pre>项目名称：ssm-movie    
 * 类名称：TreeServiceImpl    
 * 类描述：    
 * 创建人：zyl   
 * 创建时间：2022年1月5日 上午10:08:53    
 * 修改人：zyl 
 * 修改时间：2022年1月5日 上午10:08:53    
 * 修改备注：       
 * @version </pre>    
 */
@Service
public class TreeServiceImpl implements TreeService {

	@Autowired
	private MovieTreeMapper treeMapper;

	/* (non-Javadoc)    
	 * @see com.ytc.service.TreeService#queryTreeList()    
	 */
	@Override
	public List<MovieTree> queryTreeList() {
		return treeMapper.queryTreeList();
	}
}
