package com.gs.service;

import com.gs.bean.User;

/**
 * Created by Master on 2017/8/3.
 */
public interface UserService extends BaseService<String, User> {

    public User queryByPhonePwd(String phone, String pwd);
}
