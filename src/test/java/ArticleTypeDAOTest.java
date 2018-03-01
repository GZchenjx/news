import com.gs.bean.Admin;
import com.gs.bean.ArticleType;
import com.gs.dao.ArticleDAO;
import com.gs.dao.ArticleTypeDAO;
import com.gs.dao.impl.ArticleTypeDAOImpl;
import com.gs.service.ArticleService;
import com.gs.service.ArticleTypeService;
import com.gs.service.impl.ArticleServiceImpl;
import com.gs.service.impl.ArticleTypeServiceImpl;
import org.junit.Test;

import java.util.List;

/**
 * Created by Master on 2017/8/2.
 */
public class ArticleTypeDAOTest {

    

    private static ArticleTypeDAO articleTypeDAO = new ArticleTypeDAOImpl();

    @Test
    public  void testAdd() {
        ArticleType articleType = new ArticleType();
        articleType.setName("军事新闻");
        articleType.setDes("军事力量不可阻挡");
        Admin admin = new Admin();
        admin.setId("8454cb69773011e79e8e80fa5b2e8425");
        articleType.setAdmin(admin);
        articleTypeDAO.add(articleType);
    }
    @Test
    public  void queryAll() {
        List<ArticleType> articleTypes =  articleTypeDAO.queryAll();
        for (ArticleType type : articleTypes) {
            System.out.println(type);
            System.out.println(type.getAdmin().getPhone());
        }
    }


    @Test
    public void querysAll(){
        ArticleTypeDAO articleTypeDAO = new ArticleTypeDAOImpl();
        List<ArticleType> articleTypes = articleTypeDAO.queryAll();
        for(ArticleType a : articleTypes){
            System.out.println(a);
        }
    }

    @Test
    public void qu(){
        ArticleTypeService articleTypeService = new ArticleTypeServiceImpl();
        ArticleType  articleType = articleTypeService.queryByName("国际新闻");
        System.out.println(articleType);
    }

    @Test
    public void addArticleType(){

    }
}
