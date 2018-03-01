package com.gs.service.impl;

import com.gs.bean.Article;
import com.gs.common.bean.Pager;
import com.gs.dao.ArticleDAO;
import com.gs.dao.impl.ArticleDAOImpl;
import com.gs.service.ArticleService;

import java.util.List;

/**
 * Created by Master on 2017/8/3.
 */
public class ArticleServiceImpl implements ArticleService {

    private ArticleDAO articleDAO;

    public ArticleServiceImpl() {
        this.articleDAO = new ArticleDAOImpl();
    }

    @Override
    public Article queryById(String s) {
        return null;
    }

    @Override
    public void add(Article article) {
        articleDAO.add(article);
    }

    @Override
    public void remove(Article article) {

    }

    @Override
    public void update(Article article) {

    }

    @Override
    public List<Article> queryAll() {
        return articleDAO.queryAll();
    }

    @Override
    public Pager<Article> queryByPager(Pager<Article> pager) {
        return articleDAO.queryByPager(pager);
    }

    @Override
    public long count() {
        return articleDAO.count();
    }

    @Override
    public List<Article> queryByTypeId(String id) {
        return articleDAO.queryByTypeId(id);
    }
}
