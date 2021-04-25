package com.company.Menu;

import com.company.CSV.*;
import com.company.Models.*;
import com.company.Services.Write_audit;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public Menu() {
    }

    public void printInventory(ArrayList<Items> inventory) {
        for (Items items : inventory) {
            System.out.println(items.getName() + ", " + items.getAmount() + ", " + items.getPrice());
        }
    }

    public void menu() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        System.out.println("Welcome!\nPlease choose one of these option to start the shopping list.");
        System.out.println("To add items in the card choose:");
        System.out.println("1. Books \n2. Toys \n3. Clothes \n4. Food \n5. Drinks \n6. Remove item \n7. See cart \n8. Change amount \n9. Finish shopping");
        System.out.println("10. Exit \n11. Show inventory");

        Cart cart = new Cart();
        String name;
        double price;
        int amount;
        ArrayList<Items> inventory = new ArrayList<>();
        Read_books.ReadBook(inventory);
        Read_clothes.ReadClothes(inventory);
        Read_drinks.ReadDrinks(inventory);
        Read_food.ReadFoof(inventory);
        Read_toys.ReadToys(inventory);
        while (option >= -1 && option <=11) {
            System.out.println("Your choice: ");
            option = scanner.nextInt();
            switch (option) {
                case 1 -> { //books
                    System.out.println("name: ");
                    scanner.skip("\n");
                    name = scanner.nextLine();

                    System.out.println("author: ");
                    String author = scanner.nextLine();

                    System.out.println("price: ");
                    price = scanner.nextDouble();

                    System.out.println("amount: ");
                    amount = scanner.nextInt();

                    System.out.println("genre: ");
                    scanner.skip("\n");
                    String genre = scanner.nextLine();

                    cart.addToCart(new Books(name, author, price, amount, genre));
                    Write_books.writeBook(name, author, price, amount, genre);
                    Write_audit.writeAudit("Add book to cart");
                }
                case 2 -> { //toys
                    System.out.println("name: ");
                    scanner.skip("\n");
                    name = scanner.nextLine();

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

                    cart.addToCart(new Toys(name, price, amount, genre, material, age));
                    Write_toys.writeToys(name, price, amount, genre, material, age);
                }
                case 3 -> { //clothes
                    Clothes clothes = new Clothes();
                    System.out.println("name: ");
                    scanner.skip("\n");
                    name = scanner.nextLine();

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
                    Write_clothes.writeClothes(name, size, color, price, amount);
                }
                case 4 -> { //Food
                    System.out.println("name: ");
                    scanner.skip("\n");
                    name = scanner.nextLine();

                    System.out.println("price: ");
                    price = scanner.nextDouble();

                    System.out.println("amount: ");
                    amount = scanner.nextInt();

                    System.out.println("expiration date(dd.mm.yyyy): ");
                    String expirationDate = scanner.next();

                    System.out.println("vegetarian product(true/false): ");
                    boolean vegetarian = scanner.nextBoolean();

                    Food food = new Food(name, price, amount, expirationDate,vegetarian);
                    cart.addToCart(food);
                    System.out.println("This product will expire in " + food.timeBeforeExpire() + " days.");
                    Write_food.writeFood(name, price, amount, expirationDate,vegetarian);
                }
                case 5 -> { //Drinks
                    System.out.println("name: ");
                    scanner.skip("\n");
                    name = scanner.nextLine();

                    System.out.println("price: ");
                    price = scanner.nextDouble();

                    System.out.println("amount: ");
                    amount = scanner.nextInt();

                    System.out.println("caffeine(true/false): ");
                    boolean caffeine = scanner.nextBoolean();

                    System.out.println("alcohol (%): ");
                    float alcohol = scanner.nextFloat();

                    System.out.println("volume (ml): ");
                    int volume = scanner.nextInt();
                    cart.addToCart(new Drinks(name, price, amount, alcohol, volume, caffeine));
                    Write_drinks.writeDrinks(name, price, amount, alcohol, volume,  caffeine);
                }
                case 6 -> { //Remove
                    cart.printCart();
                    System.out.println("To remove from cart write the id in the console.");
                    int id = scanner.nextInt();
                    cart.removeFromCart(cart.findId(id));
                    System.out.println("Your item was remove with succes!");
                }
                case 7 -> //show cart
                        cart.printCart();
                case 8 -> { //change amount
                    cart.printCart();
                    System.out.println("Write the ID of the item whose amount you want to modify.");
                    int id = scanner.nextInt();
                    cart.changeAmount(cart.findId(id));
                    System.out.println("Your amount was modified.");
                }
                case 9 -> { //Finish shopping sesion
                    System.out.println("Thank you for choosing our services! Have a great day! :) ");
                    cart = new Cart();
                    Read_books.ReadBook(inventory);
                    Read_clothes.ReadClothes(inventory);
                    Read_drinks.ReadDrinks(inventory);
                    Read_food.ReadFoof(inventory);
                    Read_toys.ReadToys(inventory);
                }
                case 10 -> { //Exit
                    System.out.println("Bye! :) ");
                    option = 12;
                }
                case 11 -> printInventory(inventory);
            }
        }
        scanner.close();
    }

}
