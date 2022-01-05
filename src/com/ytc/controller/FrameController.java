/** 
 * <pre>项目名称:java2021-12-27-s 
 * 文件名称:FrameController.java 
 * 包名:com.ytc.controller 
 * 创建日期:2021年12月27日下午2:05:52 
 * Copyright (c) 2021,  All Rights Reserved.</pre> 
 */  
package com.ytc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ytc.model.MovieTree;
import com.ytc.service.TreeService;

/** 
 * <pre>项目名称：java2021-12-27-s    
 * 类名称：FrameController    
 * 类描述：    
 * 创建人：zyl   
 * 创建时间：2021年12月27日 下午2:05:52    
 * 修改人：zyl 
 * 修改时间：2021年12月27日 下午2:05:52    
 * 修改备注：       
 * @version </pre>    
 */
@Controller
@RequestMapping("/frame")
public class FrameController {
	
	@Autowired
	private TreeService treeService;
	
	@RequestMapping("left")
     public String left(Model model){
		List<MovieTree> list=treeService.queryTreeList();
		model.addAttribute("list", list);
    	return "frame/left";
     }
	@RequestMapping("top")
    public String top(){
   	 return "frame/top";
    }
	@RequestMapping("center")
    public String center(){
   	 return "frame/center";
    }
}
