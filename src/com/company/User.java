package com.company;

public interface User {
    String password = "";
    String username = "";

    String getPassword();
    String getUsername();
    String getEmail();
    boolean checkPassword(String password);
}
