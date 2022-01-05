package com.ytc.mapper;

import com.ytc.model.MovieFile;

public interface MovieFileMapper {
    int deleteByPrimaryKey(Integer fileid);

    int insert(MovieFile record);

    int insertSelective(MovieFile record);

    MovieFile selectByPrimaryKey(Integer fileid);

    int updateByPrimaryKeySelective(MovieFile record);

    int updateByPrimaryKey(MovieFile record);
}