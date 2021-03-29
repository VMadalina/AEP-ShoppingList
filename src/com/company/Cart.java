package com.company;

import java.util.*;

public class Cart {

    // Instance Variables
    private double total;
    private final List<Items> items;

    //Constructor
    public Cart() {
        this.total = 0;
        this.items = new ArrayList<>();
    }

    //Getter total
    public double getTotal() {
        return total;
    }

    //Function to calculate the total cost
    private double totalCost() {
        double t = 0;
        for (Items item : this.items) {
            if (item.getAmount() > 0)
                t = t + (item.getPrice()*item.getAmount());
            else
                t = t + item.getPrice();
        }
        return t;
    }

    //Function to change the amount in the cart
    public void changeAmount(Items item) {
        System.out.println("Write + to increase the amount with 1 and - to decrease the amount with 1.");
        Scanner sc = new Scanner(System.in);
        String change = sc.next();
        System.out.println("Write the quantity you want: ");
        int quan = sc.nextInt();
        if("-".equals(change)) {
            if(item.getAmount()-quan <= 0)
                this.items.remove(item);
            else {
                for (int i = 0; i < quan; i++) {
                    item.substractAmount();
                }
            }
        }
        else {
            for (int i = 0; i < quan; i++) {
                item.addAmount();
            }
        }
        this.total = totalCost();
    }

    //Function to print the detail of the cart (ite list + total cost)
    public void printCart() {
        for (Items item : this.items) {
            System.out.println(item.getName() + ", " + String.format("%.2f", item.getPrice()) + " RON, ID: " + item.getId());
        }

        System.out.println("Totalul cosului este " + String.format("%.2f",this.total) + " RON.");
    }

    //Function to add an item to cart
    public void addToCart (Items item) {
        this.items.add(item);
        this.total = totalCost();
        Collections.sort(this.items);
    }

    //Function to remove an item friom cart
    public void removeFromCart (Items item) {
        this.items.remove(item);
        this.total = totalCost();
    }

    //Function to find an item after the id
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

