package com.ytc.mapper;

import com.ytc.model.MovieAddress;

public interface MovieAddressMapper {
    int deleteByPrimaryKey(Integer addressid);

    int insert(MovieAddress record);

    int insertSelective(MovieAddress record);

    MovieAddress selectByPrimaryKey(Integer addressid);

    int updateByPrimaryKeySelective(MovieAddress record);

    int updateByPrimaryKey(MovieAddress record);
}