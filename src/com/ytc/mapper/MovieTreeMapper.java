package com.ytc.mapper;

import java.util.List;

import com.ytc.model.MovieTree;

public interface MovieTreeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MovieTree record);

    int insertSelective(MovieTree record);

    MovieTree selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MovieTree record);

    int updateByPrimaryKey(MovieTree record);

	/** <pre>queryTreeList(这里用一句话描述这个方法的作用)   
	 * 创建人：zyl    
	 * 创建时间：2022年1月5日 上午10:10:24    
	 * 修改人：zyl     
	 * 修改时间：2022年1月5日 上午10:10:24    
	 * 修改备注： 
	 * @return</pre>    
	 */
	List<MovieTree> queryTreeList();
}