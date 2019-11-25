package com.company.ex1;

import com.company.ex1.controller.Ex1;

public class Main {
    public static void main(String[] args) {
        Ex1 e = new Ex1();
//        User user = new User("test","test");
//        System.out.println(user.login);
        e.addUser("m@m.com","m");
        e.addUser("k@k.com","k");
        e.addUser("x@x.com","x");

        e.getAllUsers();
        e.loginUser("x@x.com","y");
        e.loginUser("x@x.com","x");
    }
}
