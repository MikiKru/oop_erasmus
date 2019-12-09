package com.company.ex2.controller;

import com.company.ex1.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserControllerImpl implements UserController {

    @Override
    public void addUser(String login, String password) {
        // create user - create new object of class User
        User user = new User(login, password);
        // save object user in users collection
        users.add(user);
    }

    @Override
    public void getAllUsers() {
        // generate predicate automatically CTRL + Space
        users.forEach(System.out::println);
    }

    @Override
    public User getUserById(int user_id) {
        Optional<User> userOpt = users.stream().filter(user -> user.getUser_id() == user_id).findAny();
        if(userOpt.isPresent()){
            return userOpt.get();
        }
        return null;
    }

    @Override
    public User setUserPassword(int user_id, String newPassword) {
        return null;
    }

}
