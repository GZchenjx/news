package com.gs.service.impl;

import com.gs.bean.Admin;
import com.gs.common.bean.Pager;
import com.gs.dao.AdminDAO;
import com.gs.dao.impl.AdminDAOImpl;
import com.gs.service.AdminService;

import java.util.List;

/**
 * Created by Master on 2017/8/3.
 */
public class AdminServiceImpl implements AdminService {

    private AdminDAO adminDAO;

    public AdminServiceImpl() {
        this.adminDAO = new AdminDAOImpl();
    }

    @Override
    public Admin queryById(String s) {
        return null;
    }

    @Override
    public void add(Admin admin) {
        adminDAO.add(admin);
    }

    @Override
    public void remove(Admin admin) {

    }

    @Override
    public void update(Admin admin) {

    }

    @Override
    public List<Admin> queryAll() {
        return adminDAO.queryAll();
    }

    @Override
    public Pager<Admin> queryByPager(Pager<Admin> pager) {
        return null;
    }

    @Override
    public Admin queryByPhonePwd(String phone, String pwd) {
        return adminDAO.queryByPhonePwd(phone, pwd);
    }
}
