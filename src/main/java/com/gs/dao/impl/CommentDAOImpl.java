package com.gs.dao.impl;

import com.gs.bean.Comment;
import com.gs.common.bean.Pager;
import com.gs.dao.CommentDAO;
import com.gs.dao.HibernateDAO;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by Master on 2017/8/2.
 */
public class CommentDAOImpl extends HibernateDAO implements CommentDAO {
    @Override
    public Comment queryById(String s) {
        return null;
    }

    @Override
    public void add(Comment comment) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.save(comment);
        transaction.commit();
        session.close();
    }

    @Override
    public void remove(Comment comment) {

    }

    @Override
    public void update(Comment comment) {

    }

    @Override
    public List<Comment> queryAll() {
        return null;
    }

    @Override
    public Pager<Comment> queryByPager(Pager<Comment> pager) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }
}
