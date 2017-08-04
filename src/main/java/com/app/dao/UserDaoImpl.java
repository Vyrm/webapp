package com.app.dao;

import com.app.model.User;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Component
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void create(String login, String password) {
        User user = new User(login, password);
        entityManager.persist(user);
    }

    @Transactional
    public User find(String login) {
        TypedQuery<User> typedQuery = entityManager.createQuery("SELECT u FROM User u WHERE u.login =:login", User.class)
                .setParameter("login", login);
        List<User> list = typedQuery.getResultList();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
