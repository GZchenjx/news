package com.gs.bean;

import java.util.Date;

/**
 * Created by Master on 2017/8/2.
 */
public class ArticleView {

    private User user;
    private Article article;
    private Date viewTime;

    public Date getViewTime() {
        return viewTime;
    }

    public void setViewTime(Date viewTime) {
        this.viewTime = viewTime;
    }

    @Override
    public String toString() {
        return "ArticleView{" +
                "viewTime=" + viewTime +
                '}';
    }
}
