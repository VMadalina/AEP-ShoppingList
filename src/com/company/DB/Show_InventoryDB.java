package com.company.DB;

import java.sql.*;

public class Show_InventoryDB {
    static String url = "jdbc:mysql://localhost:3306/shoppinglist";
    static  String username = "root";
    static String password = "INgenium530*";

    //SHOW FUNCTIONS
    public static void ShowBookDB(){
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "SELECT * FROM books";
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String name = resultSet.getString("name");
                String author = resultSet.getString("author");
                double price = resultSet.getDouble("price");
                int amount = resultSet.getInt("amount");
                String genre = resultSet.getString("genre");
                System.out.println("ID:"+id+"\nName:" +name+ "\nAuthor:"+author+"\nPrice:"+price+"\nAmount: "+amount+" \nGenre:" + genre+"\n");
            }
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void ShowClothesDB(){
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "SELECT * FROM clothes";
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String name = resultSet.getString("name");
                String size = resultSet.getString("size");
                String color = resultSet.getString("color");
                double price = resultSet.getDouble("price");
                int amount = resultSet.getInt("amount");
                System.out.println("ID:"+id+"\nName:" +name+ "\nSize:"+size+ "\nColor:" + color+ "\nPrice:"+price+"\nAmount: "+amount+"\n");
            }
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void ShowDrinksDB(){
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "SELECT * FROM drinks";
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                int amount = resultSet.getInt("amount");
                double alcVol = resultSet.getDouble("alcVol");
                int volume = resultSet.getInt("volume");
                String coffeine = resultSet.getString("coffeine");
                System.out.println("ID:"+id+"\nName:" +name+"\nPrice:"+price+"\nAmount: "+amount+"\nalcVol:" + alcVol+"\nVolume:" + volume+"\nCaffeine:" + coffeine+"\n");
            }
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void ShowFoodDB(){
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "SELECT * FROM food";
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                int amount = resultSet.getInt("amount");
                String expDate = resultSet.getString("expDate");
                String vegetarian = resultSet.getString("vegetarian");
                System.out.println("ID:"+id+"\nName:" +name+"\nPrice:"+price+"\nAmount: "+amount+"\nExpiration Date:" + expDate+"\nIs vegetarian:" + vegetarian+"\n");
            }
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void ShowToysDB(){
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "SELECT * FROM toys";
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                int amount = resultSet.getInt("amount");
                String genre = resultSet.getString("genre");
                String material = resultSet.getString("material");
                int age = resultSet.getInt("age");
                System.out.println("ID:"+id+"\nName:" +name+"\nPrice:"+price+"\nAmount: "+amount+"\nGenre:" + genre+"\nMaterial:" + material+"\nAge+:" + age+"\n");
            }
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
