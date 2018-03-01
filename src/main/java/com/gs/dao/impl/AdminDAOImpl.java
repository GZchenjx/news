package com.gs.dao.impl;

import com.gs.bean.Admin;
import com.gs.common.EncriptUtil;
import com.gs.common.bean.Pager;
import com.gs.dao.AdminDAO;
import com.gs.dao.HibernateDAO;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Created by Master on 2017/8/2.
 */
public class AdminDAOImpl extends HibernateDAO implements AdminDAO {


    public Admin queryById(String s) {
        return null;
    }

    public void add(Admin admin) {
        Session session= getSession();
        Transaction transaction = session.beginTransaction();
        session.save(admin);
        transaction.commit();
        session.close();
    }

    public void remove(Admin admin) {

    }

    public void update(Admin admin) {

    }

    public List<Admin> queryAll() {
        Session session = getSession();
        Query q = session.createQuery("from Admin");
        List<Admin> admin = q.list();
        return admin;

    }

    public Pager<Admin> queryByPager(Pager<Admin> pager) {
        return null;
    }

    public long count() {
        return 0;
    }

    public Admin queryByPhonePwd(String phone, String pwd) {
        Session session = getSession();
        Query query = session.createQuery("from Admin where phone = :phone and pwd = :pwd");
        query.setParameter("phone", phone);
        query.setParameter("pwd", EncriptUtil.md5(pwd));
        Admin admin = (Admin) query.uniqueResult();
        // session.close();
        return admin;
    }
}
