/** 
 * <pre>项目名称:ssm-movie 
 * 文件名称:MovieController.java 
 * 包名:com.ytc.controller 
 * 创建日期:2022年1月5日上午10:18:13 
 * Copyright (c) 2022,  All Rights Reserved.</pre> 
 */  
package com.ytc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ytc.model.Movie;
import com.ytc.service.MovieService;
import com.ytc.util.PageUtil;

/** 
 * <pre>项目名称：ssm-movie    
 * 类名称：MovieController    
 * 类描述：    
 * 创建人：zyl   
 * 创建时间：2022年1月5日 上午10:18:13    
 * 修改人：zyl 
 * 修改时间：2022年1月5日 上午10:18:13    
 * 修改备注：       
 * @version </pre>    
 */
@Controller
@RequestMapping("/movie")
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	/**
	 * <pre>toShowMovie(跳转查询页面)   
	 * 创建人：zyl    
	 * 创建时间：2022年1月5日 上午10:45:14    
	 * 修改人：zyl     
	 * 修改时间：2022年1月5日 上午10:45:14    
	 * 修改备注： 
	 * @return</pre>
	 */
	@RequestMapping("toShowMovie")
	public String toShowMovie(){
		return "movie/showMovie";
	}
	/**
	 * <pre>queryMovieList(列表展示页面)   
	 * 创建人：zyl    
	 * 创建时间：2022年1月5日 上午10:45:36    
	 * 修改人：zyl     
	 * 修改时间：2022年1月5日 上午10:45:36    
	 * 修改备注： 
	 * @param model
	 * @return</pre>
	 */
	@RequestMapping("queryMovieList")
	public String queryMovieList(Model model,PageUtil<Movie> page){ 
	   //查询分页
		PageUtil<Movie> page1=movieService.queryMovieList(page);
		//把查询的结果放到model中
		model.addAttribute("page", page1);
		return "movie/listMovie";
	}
	/**
	 * <pre>delMovie(单个删除)   
	 * 创建人：zyl    
	 * 创建时间：2022年1月5日 上午11:14:27    
	 * 修改人：zyl     
	 * 修改时间：2022年1月5日 上午11:14:27    
	 * 修改备注： </pre>
	 */
	@RequestMapping("delMovie")
	@ResponseBody
	public void delMovie(Integer movieid){
		movieService.delMovie(movieid);
	}
}
