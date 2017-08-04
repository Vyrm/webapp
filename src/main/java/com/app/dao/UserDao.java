package com.app.dao;

import com.app.model.User;
import org.springframework.stereotype.Component;

@Component
public interface UserDao {
    void create(String login, String password);

    User find(String login);
}
