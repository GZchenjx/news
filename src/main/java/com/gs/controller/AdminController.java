package com.gs.controller;

import com.gs.bean.Admin;
import com.gs.bean.Article;
import com.gs.bean.ArticleType;
import com.gs.common.bean.ControllerResult;
import com.gs.common.bean.Pager;
import com.gs.service.AdminService;
import com.gs.service.ArticleService;
import com.gs.service.ArticleTypeService;
import com.gs.service.impl.AdminServiceImpl;
import com.gs.service.impl.ArticleServiceImpl;
import com.gs.service.impl.ArticleTypeServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Master on 2017/8/3.
 */
public class AdminController extends ActionSupport implements ServletRequestAware {

    private ArticleService articleService;
    private ArticleTypeService articleTypeService;
    private AdminService adminService;
    private HttpServletRequest request;
    private HttpSession session;

    private Admin admin;

    private ArticleType articleType;

    private ControllerResult result;


    public ArticleType getArticleType() {
        return articleType;
    }

    public void setArticleType(ArticleType articleType) {
        this.articleType = articleType;
    }

    public AdminController() {
        this.adminService = new AdminServiceImpl();
        this.articleService = new ArticleServiceImpl();
        this.articleTypeService = new ArticleTypeServiceImpl();
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public ControllerResult getResult() {
        return result;
    }

    public String page() {
        return "page";
    }

    public String login() {


        admin = adminService.queryByPhonePwd(admin.getPhone(), admin.getPwd());
        if (admin == null) {
            result = ControllerResult.getFailResult("登录名或密码错误");
        } else {
            HttpSession session = request.getSession();
            session.setAttribute("login_admin", admin);
            result = ControllerResult.getSuccessResult("登录成功");
        }

        return "login";
    }



    public String allNews(){
        int page = 1;
        int pageSize = 10;
        String pageStr = request.getParameter("page");
        long count = articleService.count();
        long pageCount = count % pageSize == 0 ? count / pageSize : (count / pageSize) + 1;
        if (pageStr != null) {
            page = Integer.valueOf(pageStr);
            if (page < 1){
                page = 1;
            }
            if (page > pageCount) {
                page = (int) pageCount;
            }
        }
        Pager<Article> pager = new Pager<>();
        pager.setPageNo(page);
        pager.setPageSize(pageSize);
        pager = articleService.queryByPager(pager);

        request.setAttribute("pageCount", pageCount);
        request.setAttribute("nowPage", page);
        request.setAttribute("newsList", pager.getResults());
        return "allNews";
    }

    public String fenleiNews(){

        return "fenleiNews";
    }
    public String fen(){
        List<Article> articles = articleService.queryByTypeId(articleType.getId());
        System.out.println(articleType.getId());
        request.setAttribute("articles",articles);
        return "fen";
    }


    public String addNews(){
        
        return "addNews";
    }

    @Override
    public void setServletRequest(HttpServletRequest httpServletRequest) {
        this.request = httpServletRequest;
    }
}
