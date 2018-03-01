package com.gs.dao.impl;

import com.gs.bean.User;
import com.gs.common.EncriptUtil;
import com.gs.common.bean.Pager;
import com.gs.dao.HibernateDAO;
import com.gs.dao.UserDAO;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Created by Master on 2017/8/3.
 */
public class UserDAOImpl extends HibernateDAO implements UserDAO{
    @Override
    public User queryByPhonePwd(String phone, String pwd) {
        Session session = getSession();
        Query query = session.createQuery("from User where phone = :phone and pwd = :pwd");
        query.setParameter("phone", phone);
        query.setParameter("pwd", EncriptUtil.md5(pwd));
        User user = (User) query.uniqueResult();
        session.close();
        return user;
    }

    @Override
    public User queryById(String s) {
        return null;
    }

    @Override
    public void add(User user) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();
    }

    @Override
    public void remove(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public List<User> queryAll() {
        return null;
    }

    @Override
    public Pager<User> queryByPager(Pager<User> pager) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }
}
