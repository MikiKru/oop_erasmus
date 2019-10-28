package com.company.ex1;

public class Main {
    public static void main(String[] args) {
        Ex1 e = new Ex1();

        e.addUser("m@m.com","m");
        e.addUser("k@k.com","k");
        e.addUser("x@x.com","x");

        e.getAllUsers();
    }
}
