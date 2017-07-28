package com.app;

import com.app.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
    private ApplicationContext applicationContext =
            new ClassPathXmlApplicationContext("spring.xml");

    @Test
    public void testDbCreate(){
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.create("Vasa", "pass");
    }
}
