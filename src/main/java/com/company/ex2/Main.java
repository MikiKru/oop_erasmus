package com.company.ex2;

import com.company.ex2.controller.UserController;
import com.company.ex2.controller.UserControllerImpl;

public class Main {
    public static void main(String[] args) {
        UserControllerImpl uci = new UserControllerImpl();
        uci.addUser("test","test");
        
    }
}
