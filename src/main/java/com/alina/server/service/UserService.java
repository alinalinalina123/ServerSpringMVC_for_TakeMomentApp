package com.alina.server.service;

import com.alina.server.entity.User;

import java.util.List;

/**
 * Created by alina on 31.03.2017.
 */
public interface UserService {
    List<User> getAll();
    User getByID(String log);
    Boolean getByLogin(String log);
    User save(User user);
    User update(String login,User user1);
    void remove(long id);
}
