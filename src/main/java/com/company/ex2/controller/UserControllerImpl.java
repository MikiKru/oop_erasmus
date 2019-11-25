package com.company.ex2.controller;

import com.company.ex1.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserControllerImpl implements UserController {
    
    @Override
    public void addUser(String login, String password) {
        // create user - create new object of class User
        User user = new User(login, password);
        // save object user in users collection
        users.add(user);
    }
}
