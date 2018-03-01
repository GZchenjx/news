package com.gs.service.impl;

import com.gs.bean.Comment;
import com.gs.common.bean.Pager;
import com.gs.dao.CommentDAO;
import com.gs.dao.impl.CommentDAOImpl;
import com.gs.service.CommentService;

import java.util.List;

/**
 * Created by Master on 2017/8/3.
 */
public class CommentServiceImpl implements CommentService {

    private CommentDAO commentDAO;

    public CommentServiceImpl() {
        this.commentDAO = new CommentDAOImpl();
    }

    @Override
    public Comment queryById(String s) {
        return null;
    }

    @Override
    public void add(Comment comment) {
        commentDAO.add(comment);
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
}
