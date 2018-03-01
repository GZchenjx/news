package com.gs.dao;

import com.gs.bean.User;

/**
 * Created by Master on 2017/8/3.
 */
public interface UserDAO extends BaseDAO<String, User> {
    public User queryByPhonePwd(String phone, String pwd);
}
