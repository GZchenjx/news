package com.gs.service;

import com.gs.bean.Admin;
import com.gs.bean.Article;

/**
 * Created by Master on 2017/8/3.
 */
public interface AdminService extends BaseService<String, Admin> {

    public Admin queryByPhonePwd(String phone, String pwd);


}
