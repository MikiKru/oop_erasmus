package com.company.ex1;
// JavaBeans design pattern
// -> private fields
// -> public getters and setters -> ALT + Insert
// -> constructor -> special method that assign initial value to the selected fields
import java.time.LocalDateTime;

// model class -> class that determine data structure -> ORM - object relationship mapping
public class User {
    private int user_id;
    private String login;
    private String password;
    private LocalDateTime registrationDateTime = LocalDateTime.now();
    private boolean blocked = false;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
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
