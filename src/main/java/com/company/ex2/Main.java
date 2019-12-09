package com.company.ex2;

import com.company.ex2.controller.UserController;
import com.company.ex2.controller.UserControllerImpl;

public class Main {
    public static void main(String[] args) {
        UserControllerImpl uci = new UserControllerImpl();
        uci.addUser("test","test");
        uci.addUser("test1","test1");
        uci.addUser("test2","test2");
        uci.getAllUsers();
        System.out.println("Founded user : " + uci.getUserById(2));
        uci.setUserPassword(2,"xxx");
    }
}
