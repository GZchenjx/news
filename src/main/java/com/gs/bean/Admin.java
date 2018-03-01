package com.gs.bean;

import org.apache.struts2.json.annotations.JSON;

import java.util.Set;

/**
 * Created by Master on 2017/8/2.
 */
public class Admin {
    private String id;
    private String phone;
    private String pwd;

    private Set<ArticleType> articleTypes;
    private Set<Article> articles;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @JSON(serialize = false)
    public Set<ArticleType> getArticleTypes() {
        return articleTypes;
    }

    public void setArticleTypes(Set<ArticleType> articleTypes) {
        this.articleTypes = articleTypes;
    }

    @JSON(serialize = false)
    public Set<Article> getArticles() {
        return articles;
    }

    public void setArticles(Set<Article> articles) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
