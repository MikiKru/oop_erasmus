package com.company;

import com.company.ex1.model.User;

// TIPS FOR IntelliJ
// sout - System.out.println();
// psvm - public static void main(String[] args) {}
// CLTR + SHIFT + F10 - run
public class Main {
    public static void main(String[] args) {
        // somewhere in the project
        User user = new User("test","test");
        System.out.println(user.login);
        // constant value
        final double PI;
        System.out.println("Start Java");
        PI = 6.4;
        System.out.println("Pi value: " + PI);
        // Type signature; - declaration
        String name;
        // dssignment signature = value;
        name = "Michal";
        System.out.println("name = " + name);
        // declaration and initialize
        long age = 40;
        char sign = '6';
        boolean flag = true;
        System.out.println("age = " + age);
        System.out.println("sign = " + sign);
        System.out.println("flag = " + flag);

    }
}
