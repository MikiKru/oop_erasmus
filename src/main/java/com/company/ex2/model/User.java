package com.company.ex2.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@ToString       // annotation implementas toString() method for each field
@Getter         // annotation implements getters for each field
@Setter
@NoArgsConstructor
public class User {
    private static int global_id = 1;
    private int user_id;
    public String login;
    private String password;
    private LocalDateTime registrationDateTime = LocalDateTime.now();
    private boolean blocked = false;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.user_id = global_id;
        global_id ++;
    }

    public static void main(String[] args) {
        User user = new User();
        user.setLogin("test");
        System.out.println(user.getLogin());
        User userSepcified = new User("x","x");
        System.out.println(userSepcified);
    }
}
