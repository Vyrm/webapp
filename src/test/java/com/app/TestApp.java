package com.app;

import com.app.config.Initializer;
import com.app.dao.UserDao;
import com.app.dao.UserDaoImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
    private ApplicationContext applicationContext =
            new AnnotationConfigApplicationContext(Initializer.class);

    @Test
    public void testDbCreate(){

        UserDao userDao = (UserDaoImpl) applicationContext.getBean("userDaoImpl");
        userDao.create("Vasa", "pass");
    }
}
