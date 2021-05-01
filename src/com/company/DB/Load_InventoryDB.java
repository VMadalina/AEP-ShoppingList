package com.company.DB;

import com.company.Models.*;

import java.sql.*;
import java.util.ArrayList;

public class Load_InventoryDB {
    static String url = "jdbc:mysql://localhost:3306/shoppinglist";
    static  String username = "root";
    static String password = "INgenium530*";

    //LOAD FUNCTIONS
    public static void LoadBooks(ArrayList<Items> books) {
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
                Items.setId(id);
                books.add(new Books(name, author,price,amount,genre));
            }
            con.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void LoadClothes(ArrayList<Items> clothes) {
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
                Items.setId(id);
                clothes.add(new Clothes(name, size,color,price,amount));
            }
            con.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void LoadDrinks(ArrayList<Items> drinks) {
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
                Items.setId(id);
                drinks.add(new Drinks(name, price, amount, (float) alcVol, volume, coffeine));
            }
            con.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void LoadFood(ArrayList<Items> food) {
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
                Items.setId(id);
                food.add(new Food(name, price, amount, expDate, vegetarian));
            }
            con.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void LoadToys(ArrayList<Items> toys) {
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
                Items.setId(id);
                toys.add(new Toys(name, price, amount, genre, material, age));
            }
            con.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
