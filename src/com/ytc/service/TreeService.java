/** 
 * <pre>项目名称:ssm-movie 
 * 文件名称:TreeService.java 
 * 包名:com.ytc.service 
 * 创建日期:2022年1月5日上午10:08:36 
 * Copyright (c) 2022,  All Rights Reserved.</pre> 
 */  
package com.ytc.service;

import java.util.List;

import com.ytc.model.MovieTree;

/** 
 * <pre>项目名称：ssm-movie    
 * 类名称：TreeService    
 * 类描述：    
 * 创建人：zyl   
 * 创建时间：2022年1月5日 上午10:08:36    
 * 修改人：zyl 
 * 修改时间：2022年1月5日 上午10:08:36    
 * 修改备注：       
 * @version </pre>    
 */
public interface TreeService {

	/** <pre>queryTreeList(这里用一句话描述这个方法的作用)   
	 * 创建人：zyl    
	 * 创建时间：2022年1月5日 上午10:10:05    
	 * 修改人：zyl     
	 * 修改时间：2022年1月5日 上午10:10:05    
	 * 修改备注： 
	 * @return</pre>    
	 */
	List<MovieTree> queryTreeList();

}
