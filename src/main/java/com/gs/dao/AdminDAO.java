package com.gs.dao;

import com.gs.bean.Admin;

/**
 * Created by Master on 2017/8/2.
 */
public interface AdminDAO extends BaseDAO<String, Admin> {

    public Admin queryByPhonePwd(String phone, String pwd);


}
