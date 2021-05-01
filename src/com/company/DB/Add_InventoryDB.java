package com.company.DB;

import com.company.Models.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Add_InventoryDB {
    static String url = "jdbc:mysql://localhost:3306/shoppinglist";
    static  String username = "root";
    static String password = "INgenium530*";

    //ADD FUNCTIONS
    public static void AddBook(Books books) {
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "INSERT INTO books(ID, name, author, price, amount, genre) VALUES ("+books.getId()+",'"+books.getName()+"','"+books.getAuthor()+"',"+books.getPrice()+","+books.getAmount()+",'" +books.getGenre()+"')";

            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.executeUpdate();
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void AddClothes(Clothes clothes) {
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "INSERT INTO clothes(ID, name, size, color, price, amount) VALUES ("+clothes.getId()+",'"+clothes.getName()+"','"+clothes.getSize()+"','"+clothes.getColor()+"',"+clothes.getPrice()+"," +clothes.getAmount()+")";

            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.executeUpdate();
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void AddDrinks(Drinks drinks) {
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "INSERT INTO drinks(ID, name, price, amount, alcVol, volume, coffeine) VALUES ("+drinks.getId()+",'"+drinks.getName()+"',"+drinks.getPrice()+","+drinks.getAmount()+ ","+drinks.getAlcVol()+","+drinks.getVolume()+",'"+drinks.isCaffeine()+"')";

            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.executeUpdate();
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void AddFood(Food food) {
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "INSERT INTO food(ID, name, price, amount, expDate, vegetarian) VALUES ("+food.getId()+",'"+food.getName()+"',"+food.getPrice()+","+food.getAmount()+",'"+food.getExpirationDate()+"','"+food.isVegetarian()+"')";

            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.executeUpdate();
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void AddToys(Toys toys) {
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = "INSERT INTO toys(ID, name, price, amount, genre, material, age) VALUES ("+toys.getId()+",'"+toys.getName()+"',"+toys.getPrice()+","+toys.getAmount()+",'"+toys.getGenre()+"','"+toys.getMaterial()+"',"+toys.getMinimAge()+")";

            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.executeUpdate();
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    /*
    public static void ChangeAmount(ArrayList<Items> items) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Connection con = DriverManager.getConnection(url,username,password);

    }
    */
}
