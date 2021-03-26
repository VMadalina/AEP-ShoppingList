package com.company;

import java.text.ParseException;
import java.util.Scanner;

public class Menu {

    public Menu() {
    }

    public void menu() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        System.out.println("Welcome!\nPlease choose one of these option to start the shopping list.");
        System.out.println("To add items in the card choose:");
        System.out.println("1. Books \n2. Toys \n3. Clothes \n4. Food \n5. Drinks \n6. Remove item \n7. See cart \n8. Change amount \n9. Exit");

        Cart cart = new Cart();
        String name;
        double price;
        int amount;

        while (option >= -1 && option <=9) {
            System.out.println("Your choice: ");
            option = scanner.nextInt();
            switch (option) {
                case 1 -> { //books
                    System.out.println("name: ");
                    name = scanner.next();

                    System.out.println("author: ");
                    String author = scanner.next();

                    System.out.println("price: ");
                    price = scanner.nextDouble();

                    System.out.println("amount: ");
                    amount = scanner.nextInt();

                    System.out.println("genre: ");
                    String genre = scanner.next();

                    cart.addToCart(new Books(name, price, amount, author, genre));
                }
                case 2 -> { //toys
                    System.out.println("name: ");
                    name = scanner.next();

                    System.out.println("price: ");
                    price = scanner.nextDouble();

                    System.out.println("amount: ");
                    amount = scanner.nextInt();

                    System.out.println("genre: ");
                    String genre = scanner.next();

                    System.out.println("material: ");
                    String material = scanner.next();

                    System.out.println("age: ");
                    int age = scanner.nextInt();

                    cart.addToCart(new Toys(name, price, amount, age, material, genre));
                }
                case 3 -> { //clothes
                    Clothes clothes = new Clothes();
                    System.out.println("name: ");
                    name = scanner.next();

                    System.out.println("Do you know your size? If not, then write 'size' in console. If you know it, the write 'next'.");
                    String help = scanner.next();

                    if ("size".equals(help)) {
                        System.out.println("Introduce your measures (chest, waist, hip) in cm.");
                        int chest = scanner.nextInt();
                        int waist = scanner.nextInt();
                        int hip = scanner.nextInt();
                        clothes.sizeHelper(chest, waist, hip);
                    }
                    System.out.println("size: ");
                    String size = scanner.next();

                    System.out.println("color: ");
                    String color = scanner.next();

                    System.out.println("price: ");
                    price = scanner.nextDouble();

                    System.out.println("amount: ");
                    amount = scanner.nextInt();

                    clothes.setName(name);
                    clothes.setColor(color);
                    clothes.setSize(size);
                    clothes.setPrice(price);
                    clothes.setAmount(amount);
                    cart.addToCart(clothes);
                }
                case 4 -> { //Food
                    System.out.println("name: ");
                    name = scanner.next();

                    System.out.println("price: ");
                    price = scanner.nextDouble();

                    System.out.println("amount: ");
                    amount = scanner.nextInt();

                    System.out.println("expiration date: ");
                    String expirationDate = scanner.next();

                    System.out.println("vegetarian product: ");
                    boolean vegetarian = scanner.nextBoolean();

                    Food food = new Food(name, price, amount, expirationDate,vegetarian);
                    cart.addToCart(food);
                    System.out.println("This product will expire in " + food.timeBeforeExpire() + " days.");
                }
                case 5 -> { //Drinks
                    System.out.println("name: ");
                    name = scanner.next();

                    System.out.println("price: ");
                    price = scanner.nextDouble();

                    System.out.println("amount: ");
                    amount = scanner.nextInt();

                    System.out.println("caffeine: ");
                    boolean caffeine = scanner.nextBoolean();

                    System.out.println("alcohol (%): ");
                    float alcohol = scanner.nextFloat();

                    System.out.println("volume (ml): ");
                    int volume = scanner.nextInt();
                    cart.addToCart(new Drinks(name, price, amount, alcohol, volume, caffeine));
                }
                case 6 -> { //Remove
                    cart.printCart();
                    System.out.println("To remove from cart write the id in the console.");
                    int id = scanner.nextInt();
                    cart.removeFromCart(cart.findId(id));
                    System.out.println("Your item was remove with succes!");
                }
                case 7 -> //Remove
                        cart.printCart();
                case 8 -> {
                    cart.printCart();
                    System.out.println("Write the ID of the item whose amount you want to modify.");
                    int id = scanner.nextInt();
                    cart.changeAmount(cart.findId(id));
                }
                case 9 -> {
                    System.out.println("Bye! :) ");
                    option = 10;
                }
            }
        }
        scanner.close();
    }
}
