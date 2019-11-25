package com.company.ex2.controller;

import com.company.ex1.model.User;

import java.util.ArrayList;
import java.util.List;

public interface UserController {

    List<User> users = new ArrayList<>();

    void addUser(String login, String password);
}
