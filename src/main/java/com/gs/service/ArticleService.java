package com.gs.service;

import com.gs.bean.Article;

import java.util.List;

/**
 * Created by Master on 2017/8/3.
 */
public interface ArticleService extends BaseService<String, Article> {

    public long count();

    List<Article> queryByTypeId(String id);
}
