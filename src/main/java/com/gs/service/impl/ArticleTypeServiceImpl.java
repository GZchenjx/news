package com.gs.service.impl;

import com.gs.bean.ArticleType;
import com.gs.common.bean.Pager;
import com.gs.dao.ArticleTypeDAO;
import com.gs.dao.impl.ArticleTypeDAOImpl;
import com.gs.service.ArticleTypeService;

import java.util.List;

/**
 * Created by Master on 2017/8/3.
 */
public class ArticleTypeServiceImpl implements ArticleTypeService {

    private ArticleTypeDAO articleTypeDAO;

    public ArticleTypeServiceImpl() {
        this.articleTypeDAO = new ArticleTypeDAOImpl();
    }

    @Override
    public ArticleType queryById(String s) {
        return null;
    }

    @Override
    public void add(ArticleType articleType) {
        articleTypeDAO.add(articleType);
    }

    @Override
    public void remove(ArticleType articleType) {

    }

    @Override
    public void update(ArticleType articleType) {

    }

    @Override
    public List<ArticleType> queryAll() {
        return articleTypeDAO.queryAll();
    }

    @Override
    public Pager<ArticleType> queryByPager(Pager<ArticleType> pager) {
        return articleTypeDAO.queryByPager(pager);
    }

    @Override
    public ArticleType queryByName(String name) {
        return articleTypeDAO.queryByName(name);
    }
}
