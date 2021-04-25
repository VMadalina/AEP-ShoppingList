package com.company.Models;

public class Toys extends Items {
    // Instance Variables
    private int minimAge;
    private String material;
    private String genre; //Boys, Girls, Universal

    //Constructor
    public Toys(String name, double price, int amount, String genre, String material,  int minimAge) {
        super(name, price, amount);
        this.minimAge = minimAge;
        this.material = material;
        this.genre = genre;
    }

    //Getter and setter for minimAge
    public int getMinimAge() {
        return minimAge;
    }

    public void setMinimAge(int minimAge) {
        this.minimAge = minimAge;
    }

    //Getter and setter for material
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    //Getter and setter for genre
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
