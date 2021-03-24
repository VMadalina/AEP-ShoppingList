package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        Items items = new Items("lapte", 2.3d, 2);
//        Clothes pants = new Clothes("Pantaloni", 12.3d, 3, 'M', "Blue");

        Cart cart = new Cart();
        cart.addToCart(new Items("lapte", 2.3d, 2));
        cart.addToCart(new Clothes("Pantaloni", 12.3d, 3, 'M', "Blue"));

//        cart.addToCart(new Items("lapte", 2.3d, 2));
//        cart.addToCart(new Clothes("Pantaloni", 12.3d, 3, 'M', "Blue"));

        cart.printCart();

    }
}
