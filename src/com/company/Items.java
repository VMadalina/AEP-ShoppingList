package com.company;

public class Items implements Comparable <Items>{

    //Instance Variables
    private static int ID = 1;
    private final int id;
    private int amount;
    private double price;
    private String name;


    //Constructor Declaration of Class
    public Items( String name, double price, int amount) {
        this.amount = amount;
        this.price = price;
        this.name = name;
        this.id = ID;
        ID++;
    }

    public Items() {
        this.id = ID;
        ID++;
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

    @Override
    public int compareTo(Items item) {
        double price = item.getPrice();
        double result = this.getPrice() - price;
        return (int) result;
    }

    //Function to modify the amount with +1
    public void addAmount() {
        int amount = this.getAmount() + 1;
        this.setAmount(amount);
    }

    //Function to modify the amount with -1
    public void substractAmount() {
        int amount = this.getAmount() - 1;
        this.setAmount(amount);
    }
}
