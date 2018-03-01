package com.gs.service.impl;

import com.gs.bean.User;
import com.gs.common.bean.Pager;
import com.gs.dao.UserDAO;
import com.gs.dao.impl.UserDAOImpl;
import com.gs.service.UserService;

import java.util.List;

/**
 * Created by Master on 2017/8/3.
 */
public class UserServiceImpl implements UserService {

    private UserDAO userDAO;

    public UserServiceImpl() {
        this.userDAO = new UserDAOImpl();
    }

    @Override
    public User queryByPhonePwd(String phone, String pwd) {
        return userDAO.queryByPhonePwd(phone, pwd);
    }

    @Override
    public User queryById(String s) {
        return null;
    }

    @Override
    public void add(User user) {
        userDAO.add(user);
    }

    @Override
    public void remove(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public List queryAll() {
        return null;
    }

    @Override
    public Pager queryByPager(Pager pager) {
        return null;
    }
}
