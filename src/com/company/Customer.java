package com.company;

public class Customer implements User {

    // Instance Variables
    private final String username;
    private final String password;
    private final String email;

    //Constructor
    public Customer(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    //Getter username
    public String getUsername() {
        return username;
    }


    //Getter password
    public String getPassword() {
        return password;
    }

    //Getter email
    public String getEmail() {
        return email;
    }


    public boolean checkPassword(String password) {
        if(password.matches("[A-Z][a-z]{5,}+[1-9]+"))
            return true;
        else
            return false;
    }
}
