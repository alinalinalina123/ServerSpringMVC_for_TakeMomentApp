package com.alina.server.controller;

import com.alina.server.entity.User;
import com.alina.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;


import java.util.List;

/**
 * Created by alina on 26.03.2017.
 */
@RestController
@ResponseBody
@RequestMapping(value = "/UC")
public class UserController {

@Autowired
private UserService service;
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseBody
    public List<User> getAllUsers() {
        return service.getAll();
    }
    @RequestMapping(value = "/login/{log}", method = RequestMethod.GET)
    @ResponseBody
    public Boolean getUserByLogin(@PathVariable("log") String login) {
        return service.getByLogin(login);
    }

    @RequestMapping(value = "/userData/{log}", method = RequestMethod.GET)
    @ResponseBody
    public User getUserData(@PathVariable("log") String login) {
        return service.getByID(login);
    }
    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    @ResponseBody
    public User saveUser(@RequestBody User user) {
        return service.save(user);
    }
    @RequestMapping(value = "/updateUser/{log}", method = RequestMethod.POST)
    @ResponseBody
    public User updateUser(@PathVariable("log") String login,@RequestBody User user1) {

        return service.update(login,user1);
    }

    @RequestMapping(value = "/userDelete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void delete(@PathVariable("id") long id) {
        service.remove(id);
    }

}

