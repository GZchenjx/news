import com.gs.bean.Admin;
import com.gs.bean.Article;
import com.gs.bean.ArticleType;
import com.gs.bean.Comment;
import com.gs.common.bean.Pager;
import com.gs.dao.ArticleDAO;
import com.gs.dao.impl.ArticleDAOImpl;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

/**
 * Created by Master on 2017/8/2.
 */
public class ArticleDAOTest {

    private static ArticleDAO articleDAO = new ArticleDAOImpl();
     @Test
    public  void testAdd() {
         Admin admin = new Admin();

        ArticleType articleType = new ArticleType();
        articleType.setId("402880345da1c27c015da1c27d6b0000");

        admin.setId("8454cb69773011e79e8e80fa5b2e8425");
        for (int i = 0; i < 20; i++) {
            Article article = new Article();
            article.setTitle("title " + (i + 1));
            article.setAbstracts("abstracts"+1);
            article.setContent("content " + (i + 1));
            article.setPubTime(new Date(System.currentTimeMillis()));
            article.setArticleType(articleType);
            article.setAdmin(admin);
            articleDAO.add(article);
        }
    }
    @Test
    public  void testQueryPager() {
        Pager<Article> pager = new Pager<>();
        pager.setPageNo(1);
        pager.setPageSize(5);
        pager = articleDAO.queryByPager(pager);
        System.out.println(pager.getTotal());
        for (Article a : pager.getResults()) {
            System.out.println(a);
            System.out.println(a.getAdmin());
            Set<Comment> comments = a.getComments();
            for (Comment c : comments) {
                System.out.println(c);
            }
        }
    }


}
