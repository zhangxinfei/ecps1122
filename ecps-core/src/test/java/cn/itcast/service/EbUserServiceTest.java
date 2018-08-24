package cn.itcast.service;

import cn.itcast.model.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EbUserServiceTest {
    ApplicationContext ctx;
    @Before
    public void setUp() throws Exception {
        ctx = new ClassPathXmlApplicationContext("beans.xml");
    }

    @Test
    public void insert() throws Exception {
        EbUserService userService = (EbUserService) ctx.getBean("ebUserServiceImpl");
        User user = new User();
        user.setUsername("user004");
        user.setUserAdress("华航");
        user.setPassword("000");
        user.setUserIphone(111000);
        user.setUserQq(235000);
        user.setUserStudentid("20162405A131");
        user.setUserSex("WOMAN");
        try {
            userService.insert(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void deleteByPrimaryKey() {
        EbUserService userService = (EbUserService) ctx.getBean("ebUserServiceImpl");
        try {
            userService.deleteByPrimaryKey(18);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void updateByPrimaryKey() {
        EbUserService userService = (EbUserService) ctx.getBean("ebUserServiceImpl");
        User user = new User();
//        user.setUserId();
        user.setUsername("user005");
        user.setUserAdress("北大");
        user.setPassword("000");
        user.setUserIphone(1000);
        user.setUserQq(235010);
        user.setUserStudentid("20162405A10");
        user.setUserSex("MAN");
        try {
            userService.updateByPrimaryKey(user.getUserId(),user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    通过id查找用户
    @Test
    public void selectById() {
        EbUserService userService = (EbUserService) ctx.getBean("ebUserServiceImpl");
        try {
            userService.selectByPrimaryKey(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}