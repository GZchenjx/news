package com.gs.service;

import com.gs.common.bean.Pager;

import java.util.List;

/**
 * Created by Master on 2017/8/3.
 */
public interface BaseService<PK, T> {

    public T queryById(PK pk);
    public void add(T t);
    public void remove(T t);
    public void update(T t);
    public List<T> queryAll();
    public Pager<T> queryByPager(Pager<T> pager);
}
