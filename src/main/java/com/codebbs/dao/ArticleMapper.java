package com.codebbs.dao;

import com.codebbs.pojo.Article;

public interface ArticleMapper {
    int deleteByPrimaryKey(Integer aId);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(Integer aId);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKey(Article record);
}