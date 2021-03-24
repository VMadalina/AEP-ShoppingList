package com.company;

public class Items {

    //Instance Variables
    private static int ID = 1;
    private final int id = 0;
    private int amount;
    private double price;
    private String name;


    //Constructor Declaration of Class
    public Items( String name, double price, int amount) {
        this.amount = amount;
        this.price = price;
        this.name = name;
    }

    //Getter price
    public double getPrice() {
        return price;
    }

    //Getter amount
    public int getAmount() {
        return amount;
    }

    //setter price
    public void setPrice(double price) {
        this.price = price;
    }

    //Setter amount
    public void setAmount(int amount) {
        this.amount = amount;
    }

    //Getter ID
    public int getId() {
        return id;
    }

    public static int getID() {
        return ID;
    }

    //Setter ID
    public static void setID(int ID) {
        Items.ID = ID;
    }

    //Getter name
    public String getName() {
        return name;
    }

    //Setter name
    public void setName(String name) {
        this.name = name;
    }
}
