package com.app.dao;

import com.app.model.User;

public interface UserDao {
    void create (String login, String password);
    User find (String login);
}
