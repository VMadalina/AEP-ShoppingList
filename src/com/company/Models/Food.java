package com.company.Models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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

    //Function to calculate in how many days the product expires
    public int timeBeforeExpire() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd.mm.yyyy");
        Date sysDate = new Date();
        String data = this.getExpirationDate();
        Date date = format.parse(data);
        int difference = (int) (date.getTime() - sysDate.getTime());
        return (difference / (1000*60*60*24)) + 1;
    }
}
