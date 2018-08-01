package com.whcs.test;

import com.whcs.dao.IUserDao;
import com.whcs.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Yegz on 2017/9/4.
 */
/*Spring 和 Junit4 集成*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class TestSpring {

    /*@Resource
    IUserService userService;

    @Test
    public void testSpring(){
        userService.getUserInfo();
    }*/

    @Test
    public void testSpring2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserDao userDao = (IUserDao) context.getBean("userDao");
        userDao.getUserInfo();
    }
}
