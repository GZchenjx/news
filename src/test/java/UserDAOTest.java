import com.gs.bean.User;
import com.gs.common.EncriptUtil;
import com.gs.dao.UserDAO;
import com.gs.dao.impl.UserDAOImpl;

/**
 * Created by Master on 2017/8/3.
 */
public class UserDAOTest {

    private static UserDAO userDAO = new UserDAOImpl();

    public static void testAdd() {
        User user = new User();
        user.setPhone("13777777777");
        user.setPwd(EncriptUtil.md5("123456"));
        userDAO.add(user);
    }

    public static void testQuery() {
        System.out.println(userDAO.queryByPhonePwd("13777777777", EncriptUtil.md5("123456")));
    }

    public static void main(String[] args) {
        // testAdd();
        testQuery();
    }
}
