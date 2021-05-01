package com.company.DB;

import com.company.Menu.Menu;
import com.company.Models.Items;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Delete_InventoryDB {
    static String url = "jdbc:mysql://localhost:3306/shoppinglist";
    static  String username = "root";
    static String password = "INgenium530*";

    public static void Delete(ArrayList<Items> inventory, int id) {
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = switch (inventory.getClass().toString()) {
                case "class com.company.Models.Books" -> "DELETE FROM books WHERE ID=" + id + "";
                case "class com.company.Models.Clothes" -> "DELETE FROM clothes WHERE ID=" + id + "";
                case "class com.company.Models.Drinks" -> "DELETE FROM drinks WHERE ID=" + id + "";
                case "class com.company.Models.Food" -> "DELETE FROM food WHERE ID=" + id + "";
                case "class com.company.Models.Toys" -> "DELETE FROM toys WHERE ID=" + id + "";
                default -> "";
            };
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.execute();
            con.close();
            inventory.clear();
            Load_InventoryDB.LoadDrinks(inventory);
            Load_InventoryDB.LoadToys(inventory);
            Load_InventoryDB.LoadClothes(inventory);
            Load_InventoryDB.LoadFood(inventory);
            Load_InventoryDB.LoadBooks(inventory);
            Menu.setMaxID(inventory);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
