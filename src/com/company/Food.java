package com.company;

public class Food extends Items {

    // Instance Variables
    private String expirationDate;
    private boolean vegetarian;

    //Constructor
    public Food(String name, double price, int amount, String expirationDate, boolean vegetarian) {
        super(name, price, amount);
        this.expirationDate = expirationDate;
        this.vegetarian = vegetarian;
    }

    //Getter and setter for expiration date
    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    //Getter and setter for vegetarian
    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }
}
