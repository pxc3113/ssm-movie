package com.ytc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ytc.model.Movie;

public interface MovieMapper {

	/** <pre>queryCount(查询总条数)   
	 * 创建人：zyl    
	 * 创建时间：2022年1月5日 上午10:48:54    
	 * 修改人：zyl     
	 * 修改时间：2022年1月5日 上午10:48:54    
	 * 修改备注： 
	 * @return</pre>    
	 */
	long queryCount();

	/** <pre>queryMovieList(这里用一句话描述这个方法的作用)   
	 * 创建人：zyl    
	 * 创建时间：2022年1月5日 上午10:52:20    
	 * 修改人：zyl     
	 * 修改时间：2022年1月5日 上午10:52:20    
	 * 修改备注： 
	 * @param start
	 * @param pageSize
	 * @return</pre>    
	 */
	List<Movie> queryMovieList(@Param("start")int start, @Param("pageSize")int pageSize);

	/** <pre>delMovie(这里用一句话描述这个方法的作用)   
	 * 创建人：zyl    
	 * 创建时间：2022年1月5日 上午11:15:28    
	 * 修改人：zyl     
	 * 修改时间：2022年1月5日 上午11:15:28    
	 * 修改备注： 
	 * @param movieid</pre>    
	 */
	void delMovie(Integer movieid);
}