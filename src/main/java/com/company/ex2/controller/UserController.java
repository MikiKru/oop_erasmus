package com.company.ex2.controller;

import com.company.ex1.model.User;

import java.util.ArrayList;
import java.util.List;

public interface UserController {

    List<User> users = new ArrayList<>();

    void addUser(String login, String password);

    // Abstract metohod for getAllUsers from users list
    void getAllUsers();
    // Abstract method for getUser from users list based on user_id
    User getUserById(int user_id);
    // Abstract method for change user password for user taken from users list
    void setUserPassword(int user_id, String newPassword);

}
