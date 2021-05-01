package com.company.DB;

import com.company.Menu.Menu;
import com.company.Models.Items;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Update_InventoryDB {
    static String url = "jdbc:mysql://localhost:3306/shoppinglist";
    static  String username = "root";
    static String password = "INgenium530*";

    public static void ChangeAmount(ArrayList<Items> inventory, int id, int amount, String type) {
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            String query = switch (type) {
                case "class com.company.Models.Books" -> "UPDATE books SET amount="+amount+" WHERE ID="+id+"";
                case "class com.company.Models.Clothes" -> "UPDATE clothes SET amount="+amount+" WHERE ID="+ id+"";
                case "class com.company.Models.Drinks" -> "UPDATE drinks SET amount="+ amount + " WHERE ID="+ id+"";
                case "class com.company.Models.Food" -> "UPDATE food SET amount="+ amount + " WHERE ID="+ id+"";
                case "class com.company.Models.Toys" -> "UPDATE toys SET amount="+ amount + " WHERE ID="+ id+"";
                default -> throw new IllegalStateException("Unexpected value: " + inventory.getClass().toString());
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
