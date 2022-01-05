/** 
 * <pre>项目名称:ssm-movie 
 * 文件名称:MovieService.java 
 * 包名:com.ytc.service 
 * 创建日期:2022年1月5日上午10:46:44 
 * Copyright (c) 2022,  All Rights Reserved.</pre> 
 */  
package com.ytc.service;

import com.ytc.model.Movie;
import com.ytc.util.PageUtil;

/** 
 * <pre>项目名称：ssm-movie    
 * 类名称：MovieService    
 * 类描述：    
 * 创建人：zyl   
 * 创建时间：2022年1月5日 上午10:46:44    
 * 修改人：zyl 
 * 修改时间：2022年1月5日 上午10:46:44    
 * 修改备注：       
 * @version </pre>    
 */
public interface MovieService {

	/** <pre>queryMovieList(查询分页)   
	 * 创建人：zyl    
	 * 创建时间：2022年1月5日 上午10:47:54    
	 * 修改人：zyl     
	 * 修改时间：2022年1月5日 上午10:47:54    
	 * 修改备注： 
	 * @param page
	 * @return</pre>    
	 */
	PageUtil<Movie> queryMovieList(PageUtil<Movie> page);

	/** <pre>delMovie(单个删除)   
	 * 创建人：zyl    
	 * 创建时间：2022年1月5日 上午11:14:59    
	 * 修改人：zyl     
	 * 修改时间：2022年1月5日 上午11:14:59    
	 * 修改备注： 
	 * @param movieid</pre>    
	 */
	void delMovie(Integer movieid);

}
