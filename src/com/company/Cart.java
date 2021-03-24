package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Cart {

    // Instance Variables
    private double total;
    private List<Items> items;

    //Constructor
    public Cart() {
        this.total = 0;
        this.items = new ArrayList<>();
    }

    //Getter total
    public double getTotal() {
        return total;
    }

    //Getter and setter for the list
    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    //Function to calculate the total cost
    private double totalCost() {
        double t = 0;
        for (Items item : this.items) {
            t = t + item.getPrice();
        }
        return t;
    }

    public void printCart() {
        for (int i = 0; i < this.items.size(); i++) {
            System.out.println(this.items.get(i).getName() + ", " + String.format("%.2f", this.items.get(i).getPrice())+ " RON, ID: " + this.items.get(i).getId());
        }

        System.out.println("Totalul cosului este " + String.format("%.2f",this.total) + " RON.");
    }

    public void addToCart (Items item) {
        this.items.add(item);
        this.total = totalCost();
        Collections.sort(this.items);
    }

    public void removeFromCart (Items item) {
        this.items.remove(item);
        this.total = totalCost();
    }

    public Items findId(int id) {
        int i;
        for ( i = 0; i < items.size(); i++) {
            if (id == items.get(i).getId()) {
                break;
            }
        }
        if (i >= items.size()) {
            System.out.println("This item is not in cart.");
            return null;
        }
        return items.get(i);
    }
}

