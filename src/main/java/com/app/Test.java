package com.app;

import com.app.dao.UserDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserDaoImpl userDao = applicationContext.getBean(UserDaoImpl.class);
        userDao.create("Vasa", "123");
    }
}
