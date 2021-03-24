package com.company;

public class Clothes extends Items {

    // Instance Variables
    private char size; // XS, S, M, L, XL  etc.
    private String color;

    //Constructor
    public Clothes(String name, double price, int amount, char size, String color) {
        super(name, price, amount);
        this.size = size;
        this.color = color;
    }

    //Getter size
    public char getSize() {
        return size;
    }

    //Setter size
    public void setSize(char size) {
        this.size = size;
    }

    //Getter color
    public String getColor() {
        return color;
    }

    //Setter color
    public void setColor(String color) {
        this.color = color;
    }
}
