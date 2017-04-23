package com.alina.server.service;

import com.alina.server.entity.User;
import com.alina.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by alina on 31.03.2017.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;
    @Transactional(readOnly=true)
    public List<User> getAll() {
        return repository.findAll();
    }

    public User getByID(String log) {
        List<User> ur=repository.findAll();
        for (User item: ur) {
            if(item.getLogin().equals(log)) { return item;}
        }
        return null;
    }
    public Boolean getByLogin(String log) {
         List<User> ur=repository.findAll();
        for (User item: ur) {
                if(item.getLogin().equals(log)) return true;
        }
        return false;
    }

    public User update(String login,User user1){
        List<User> ur=repository.findAll();
        for (User item: ur) {
            if(item.getLogin().equals(login)) { user1.setId(item.getId()); repository.delete(item.getId()); }
        }
       return repository.saveAndFlush(user1);
    }
    public User save(User user) {
        return repository.saveAndFlush(user);
    }

    public void remove(long id) {
        repository.delete(id);
    }
}
