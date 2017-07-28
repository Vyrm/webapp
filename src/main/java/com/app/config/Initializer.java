package com.app.config;

import com.app.dao.UserDao;
import com.app.dao.UserDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Configuration
public class Initializer {
/*    @PersistenceContext
    private EntityManager entityManager;

    @Bean(name = "userDao")
    public UserDao userDao(){
        return new UserDaoImpl(entityManager);
    }*/

}
