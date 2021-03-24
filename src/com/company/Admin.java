package com.company;

public class Admin {

    // Instance Variables
    private  String adminName;
    private  String password;
    private  String email;

    //Constructor
    public Admin(String adminName, String password, String email) {
        this.adminName = adminName;
        this.password = password;
        this.email = email;
    }

    //Getter and setter for Admin name
    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    //Getter and setter for password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //Getter and setter for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
