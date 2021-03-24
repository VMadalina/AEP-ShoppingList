package com.company;

public class Customer implements User {

    // Instance Variables
    private int id;
    private String username;
    private String password;
    private String email;

    //Constructor
    public Customer(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    //Getter ID
    public int getId() {
        return id;
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

}
