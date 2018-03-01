package com.gs.dao;

import com.gs.bean.ArticleType;

/**
 * Created by Master on 2017/8/2.
 */
public interface ArticleTypeDAO extends BaseDAO<String, ArticleType> {

    public ArticleType queryByName(String name);

}
