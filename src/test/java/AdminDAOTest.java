import com.gs.bean.Admin;
import com.gs.common.EncriptUtil;
import com.gs.dao.AdminDAO;
import com.gs.dao.impl.AdminDAOImpl;
import com.gs.service.AdminService;
import com.gs.service.impl.AdminServiceImpl;
import org.junit.Test;

import java.util.List;

/**
 * Created by Master on 2017/8/2.
 */
public class AdminDAOTest {
    public static void main(String[] args) {
        AdminDAOImpl adminDAO = new AdminDAOImpl();
        Admin admin = adminDAO.queryByPhonePwd("18888888888", EncriptUtil.md5("666"));
        System.out.println(admin);
    }

    @Test
    public void addAdmin(){
        AdminDAO adminDAO = new AdminDAOImpl();
        Admin admin = new Admin();
        admin.setPhone("123456789  ");
        admin.setPwd(EncriptUtil.md5("123456"));
        adminDAO.add(admin);
        System.out.println(admin);
    }
    @Test
    public void queryByNamePwd(){
        AdminDAOImpl adminDAO = new AdminDAOImpl();
        Admin admin = adminDAO.queryByPhonePwd("123456789",EncriptUtil.md5("123456"));
        System.out.println(admin);
    }

    @Test
    public void queryByphonePwd(){
        AdminService adminDAO = new AdminServiceImpl();
        Admin admins = adminDAO.queryByPhonePwd("123456789",EncriptUtil.md5("123456"));
            System.out.println(admins);
    }
}
