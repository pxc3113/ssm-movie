package com.ytc.mapper;

import com.ytc.model.MovieType;

public interface MovieTypeMapper {
    int deleteByPrimaryKey(Integer typeid);

    int insert(MovieType record);

    int insertSelective(MovieType record);

    MovieType selectByPrimaryKey(Integer typeid);

    int updateByPrimaryKeySelective(MovieType record);

    int updateByPrimaryKey(MovieType record);
}