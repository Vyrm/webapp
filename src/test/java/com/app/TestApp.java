package com.app;

import com.app.dao.UserDaoImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

    @Test
    public void testDbCreate(){

        UserDaoImpl userDao = (UserDaoImpl) applicationContext.getBean("userDao");
        userDao.create("Vasa", "pass");
    }
}
