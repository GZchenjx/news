import com.gs.bean.Article;
import com.gs.bean.Comment;
import com.gs.bean.User;
import com.gs.dao.CommentDAO;
import com.gs.dao.impl.CommentDAOImpl;

/**
 * Created by Master on 2017/8/2.
 */
public class CommentDAOTest {

    private static CommentDAO commentDAO = new CommentDAOImpl();

    public static void testAdd() {
        Comment comment = new Comment();
        comment.setContent("我的评论");
        User u = new User();
        u.setId("b2920798775411e7a71a80fa5b2e8425");
        comment.setUser(u);
        Article article = new Article();
        article.setId("402880345da1cfad015da1cfaf030000");
        comment.setArticle(article);
        commentDAO.add(comment);
    }

    public static void main(String[] args) {
        testAdd();
    }
}
