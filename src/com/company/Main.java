package com.company;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ParseException {

//        Items items = new Items("lapte", 2.3d, 2);
//        Clothes pants = new Clothes("Pantaloni", 12.3d, 3, 'M', "Blue");
//        pants.sizeHelper(87, 72, 92);
//
//        Cart cart = new Cart();
//        cart.addToCart(new Items("lapte", 2.3d, 2));
//        cart.addToCart(new Toys("Puzzle", 23.4d, 1, 5, "carton", "Unisex" ));
//        cart.addToCart(new Clothes("geaca", 12.3d, 3, 'M', "Blue"));
//        cart.addToCart(new Toys("Puzzle", 21.4d, 1, 5, "carton", "Unisex" ));
//        cart.addToCart(new Clothes("Pantaloni", 12.3d, 3, 'M', "Blue"));
//        cart.addToCart(new Clothes("Bluza", 12.3d, 3, 'M', "Blue"));
//        cart.addToCart(new Toys("Puzzle", 23.4d, 1, 5, "carton", "Unisex" ));
//        cart.addToCart(new Toys("Puzzle", 12.5d, 1, 5, "carton", "Unisex" ));
//        cart.addToCart(new Toys("Puzzle", 23.4d, 1, 5, "carton", "Unisex" ));
//        cart.addToCart(new Toys("Puzzle", 28.4d, 1, 5, "carton", "Unisex" ));
//        cart.addToCart(new Toys("Puzzle", 23.4d, 1, 5, "carton", "Unisex" ));
//
//        cart.printCart();
//
//        cart.removeFromCart(cart.findId(2));
//        cart.removeFromCart(cart.findId(5));
//        cart.removeFromCart(cart.findId(9));
;//        cart.removeFromCart(cart.findId(1));
//
//        cart.printCart();

        Food food = new Food("lapte", 6.4d, 2, "29.03.2021", false);
        System.out.println(food.timeBeforeExpire());
    }
}
