package com.company.ex1.model;
// JavaBeans design pattern
// -> private fields
// -> public getters and setters -> ALT + Insert
// -> constructor -> special method that assign initial value to the selected fields
import java.time.LocalDateTime;

// model class -> class that determine data structure -> ORM - object relationship mapping

public class User {
    // static elements of the class
    private static int global_id = 1;
    private int user_id;
    public String login;
    private String password;
    private LocalDateTime registrationDateTime = LocalDateTime.now();
    private boolean blocked = false;

//    public static void main(String[] args) {
//        User user = new User("test","test");
//        System.out.println(user.login);
//    }

    public static int getGlobal_id(){
        return global_id;
    }


    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.user_id = global_id;
        global_id ++;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", registrationDateTime=" + registrationDateTime +
                ", blocked=" + blocked +
                '}';
    }

    public int getUser_id() {
        return user_id;
    }
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public LocalDateTime getRegistrationDateTime() {
        return registrationDateTime;
    }
    public void setRegistrationDateTime(LocalDateTime registrationDateTime) {
        this.registrationDateTime = registrationDateTime;
    }
    public boolean isBlocked() {
        return blocked;
    }
    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }
}
