package com.gs.service;

import com.gs.bean.ArticleType;

/**
 * Created by Master on 2017/8/3.
 */
public interface ArticleTypeService extends BaseService<String, ArticleType> {

    public ArticleType queryByName(String name);
}
