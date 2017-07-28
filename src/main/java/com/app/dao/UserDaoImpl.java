package com.app.dao;

import com.app.model.User;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class UserDaoImpl implements UserDao{
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void create(String login, String password) {
        User user = new User(login, password);
        entityManager.persist(user);
    }
}
