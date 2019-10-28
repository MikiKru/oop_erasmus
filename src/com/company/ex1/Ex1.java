package com.company.ex1;
import java.util.ArrayList;
import java.util.List;

public class Ex1 {
    // specifier Type signature = initialization of new object
    private List<User> users = new ArrayList<>();
    // ------ microservices ------
    // specifier returned_value signature([aguments]){}

    // method for registration user in the users collection
    public void addUser(String login, String password){
        // create user - create new object of class User
        User user = new User(login, password);
        // save object user in users collection
        users.add(user);
    }
    // method for presentation of users list
    public void getAllUsers(){
        // loops -> structure that enable iteratation of collections, table, etc
        // for (Typ name (auxillary_object) : collection)
        for (User u : users) {
            System.out.println(u);
        }
    }
    // method for login user
    public void loginUser(String login, String password){
        // check whether the (login and password) is in users list
        boolean isLogged = false;
        for (User u : users) {
            // conditional instruction
            // if ( condition ){ implementation }
            if(login.equals(u.getLogin()) && password.equals(u.getPassword())){
                System.out.println("Logged user: " + u.getLogin());
                isLogged = true;
            }
        }
        if(!isLogged){
            System.out.println("No user is logged!");
        }
    }
}
