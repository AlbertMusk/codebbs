package com.codebbs.dao;

import com.codebbs.pojo.Board;

public interface BoardMapper {
    int deleteByPrimaryKey(Integer bId);

    int insert(Board record);

    int insertSelective(Board record);

    Board selectByPrimaryKey(Integer bId);

    int updateByPrimaryKeySelective(Board record);

    int updateByPrimaryKey(Board record);
}