package com.codebbs.dao;

import com.codebbs.pojo.AUser;

public interface AUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AUser record);

    int insertSelective(AUser record);

    AUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AUser record);

    int updateByPrimaryKey(AUser record);
}