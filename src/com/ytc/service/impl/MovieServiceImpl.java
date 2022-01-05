/** 
 * <pre>项目名称:ssm-movie 
 * 文件名称:MovieServiceImpl.java 
 * 包名:com.ytc.service.impl 
 * 创建日期:2022年1月5日上午10:46:55 
 * Copyright (c) 2022,  All Rights Reserved.</pre> 
 */  
package com.ytc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ytc.mapper.MovieMapper;
import com.ytc.model.Movie;
import com.ytc.service.MovieService;
import com.ytc.util.PageUtil;

/** 
 * <pre>项目名称：ssm-movie    
 * 类名称：MovieServiceImpl    
 * 类描述：    
 * 创建人：zyl   
 * 创建时间：2022年1月5日 上午10:46:55    
 * 修改人：zyl 
 * 修改时间：2022年1月5日 上午10:46:55    
 * 修改备注：       
 * @version </pre>    
 */
@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieMapper movieMapper;
	/* (non-Javadoc)    
	 * @see com.ytc.service.MovieService#queryMovieList(com.ytc.util.PageUtil)    
	 */
	@Override
	public PageUtil<Movie> queryMovieList(PageUtil<Movie> page) {
		//查询 总条数
		long totalRow=movieMapper.queryCount();
		//计算开始的位置
		page=new PageUtil<>(page.getCpage(), totalRow, page.getPageSize());
		//通过开始和每页条数查询集合
		List<Movie> list=movieMapper.queryMovieList(page.getStart(),page.getPageSize());
		//把查询的结果放到page中
		page.setList(list);
		return page;
	}
	/* (non-Javadoc)    
	 * @see com.ytc.service.MovieService#delMovie(java.lang.Integer)    
	 */
	@Override
	public void delMovie(Integer movieid) {
		movieMapper.delMovie(movieid);		
	}

}
