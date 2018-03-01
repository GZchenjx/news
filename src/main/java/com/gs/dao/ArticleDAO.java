package com.gs.dao;

import com.gs.bean.Article;

import java.util.List;

/**
 * Created by Master on 2017/8/2.
 */
public interface ArticleDAO extends BaseDAO<String, Article> {

    List<Article>  queryByTypeId(String id);

}
