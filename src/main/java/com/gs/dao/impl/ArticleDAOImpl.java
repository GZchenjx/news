package com.gs.dao.impl;

import com.gs.bean.Admin;
import com.gs.bean.Article;
import com.gs.bean.ArticleType;
import com.gs.common.bean.Pager;
import com.gs.dao.ArticleDAO;
import com.gs.dao.HibernateDAO;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Master on 2017/8/2.
 */
public class ArticleDAOImpl extends HibernateDAO implements ArticleDAO {
    public Article queryById(String s) {
        return null;
    }

    public void add(Article article) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.save(article);
        transaction.commit();
        session.close();
    }

    public void remove(Article article) {

    }

    public void update(Article article) {

    }

    public List<Article> queryAll() {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from Atricle");
        List<Article> articles = query.list();
        transaction.commit();
        return articles;

    }

    public Pager<Article> queryByPager(Pager<Article> pager) {
        Session session = getSession();
        Query query = session.createQuery("from Article");
        query.setMaxResults(pager.getPageSize());
        query.setFirstResult(pager.getBeginIndex());
        pager.setResults(query.list());
        // session.close();
        return pager;
    }

    public long count() {
        Session session = getSession();
        long count = (Long) session.createQuery("select count(id) from Article").uniqueResult();
        session.close();
        return count;
    }

    /*
    public List<Article> queryByTypeId(String id) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        NativeQuery nativeQuery = session.createNativeQuery("select * from t_article where type_id=?");
        nativeQuery.setParameter(1,id);
        List<Object[]> objects = nativeQuery.list();
        List<Article> articles = new ArrayList<>();
        for (Object[] o : objects) {
            Article article = new Article();
            article.setId((String) o[0]);
            article.setTitle((String) o[1]);
            article.setContent((String) o[3]);
            article.setPubTime((Date) o[4]);
            ArticleType articleType = new ArticleType();
            articleType.setId((String) o[5]);
            article.setArticleType(articleType);
            Admin admin = new Admin();
            admin.setId((String) o[6]);
            article.setAdmin(admin);
            articles.add(article);
        }
        transaction.commit();
        return articles;
    }*/

    @Override
    public List<Article> queryByTypeId(String id) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from Article where articleType.id = :articleTypeId");
        query.setParameter("articleTypeId", id);
        List<Article> articles = query.list();
        System.out.println("com/gs/dao/impl/ArticleDAOImpl.java:102");
        transaction.commit();
        return articles;
    }
}
