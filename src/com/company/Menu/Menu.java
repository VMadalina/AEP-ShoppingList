package com.company.Menu;

import com.company.CSV.*;
import com.company.DB.*;
import com.company.Models.*;
import com.company.Services.Write_audit;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private static Menu menu;

    private Menu() {
    }

    public static Menu getInstance() {
        if(menu == null) {
            menu = new Menu();
        }
        return menu;
    }

    public void printInventory(ArrayList<Items> inventory) {
        for (Items items : inventory) {
            System.out.println("NUME PRODUS:" + items.getName() + ", CANTITATE: " + items.getAmount() + ", PRET: " + items.getPrice() + ", ID: " + items.getId());
        }
    }

    public static void setMaxID(ArrayList<Items> inventory) {
        int Max_id = 0;
        for (Items items : inventory) {
            if(Max_id < items.getId()) {
                Max_id = items.getId();
            }
        }
        Max_id--;
        Items.setId(Max_id);
    }

    public void totalInventory(ArrayList<Items> inventory) {
        double totalFinal;
        double totalBooks = 0;
        double totalFood = 0;
        double totalDrinks = 0;
        double totalClothes = 0;
        double totalToys = 0;
        for (Items items : inventory) {
            switch (items.getClass().toString()) {
                case "class com.company.Models.Clothes" -> totalClothes = totalClothes + items.getAmount() * items.getPrice();
                case "class com.company.Models.Toys" -> totalToys = totalToys + items.getAmount() * items.getPrice();
                case "class com.company.Models.Drinks" -> totalDrinks = totalDrinks + items.getAmount() * items.getPrice();
                case "class com.company.Models.Food" -> totalFood = totalFood + items.getAmount() * items.getPrice();
                case "class com.company.Models.Books" -> totalBooks = totalBooks + items.getAmount() * items.getPrice();
            }
        }
        totalFinal = totalBooks + totalClothes + totalDrinks + totalFood + totalToys;
        Write_totals.writeTotals(totalBooks,totalToys,totalClothes,totalDrinks,totalFood,totalFinal);
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
//        Read_books.ReadBook(inventory);
//        Read_clothes.ReadClothes(inventory);
//        Read_drinks.ReadDrinks(inventory);
//        Read_food.ReadFoof(inventory);
//        Read_toys.ReadToys(inventory);
        Load_InventoryDB.LoadBooks(inventory);
        Load_InventoryDB.LoadFood(inventory);
        Load_InventoryDB.LoadClothes(inventory);
        Load_InventoryDB.LoadToys(inventory);
        Load_InventoryDB.LoadDrinks(inventory);
        setMaxID(inventory);
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

                    Books book = new Books(name, author, price, amount, genre);
                    cart.addToCart(book);
                    Add_InventoryDB.AddBook(book);
                    Show_InventoryDB.ShowBookDB();
                    //Write_books.writeBook(name, author, price, amount, genre);
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

                    Toys toys = new Toys(name, price, amount, genre, material, age);
                    cart.addToCart(toys);
                    //Write_toys.writeToys(name, price, amount, genre, material, age);
                    Add_InventoryDB.AddToys(toys);
                    Show_InventoryDB.ShowToysDB();
                    Write_audit.writeAudit("Add toy to cart");

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
                    //Write_clothes.writeClothes(name, size, color, price, amount);
                    Add_InventoryDB.AddClothes(clothes);
                    Show_InventoryDB.ShowClothesDB();
                    Write_audit.writeAudit("Add clothes to cart");

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
                    String vegetarian = scanner.next();

                    Food food = new Food(name, price, amount, expirationDate,vegetarian);
                    cart.addToCart(food);
                    System.out.println("This product will expire in " + food.timeBeforeExpire() + " days.");
                    //Write_food.writeFood(name, price, amount, expirationDate,vegetarian);
                    Add_InventoryDB.AddFood(food);
                    Show_InventoryDB.ShowFoodDB();
                    Write_audit.writeAudit("Add food to cart");
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
                    String caffeine = scanner.next();

                    System.out.println("alcohol (%): ");
                    float alcohol = scanner.nextFloat();

                    System.out.println("volume (ml): ");
                    int volume = scanner.nextInt();
                    Drinks drinks = new Drinks(name, price, amount, alcohol, volume, caffeine);
                    cart.addToCart(drinks);
                    //Write_drinks.writeDrinks(name, price, amount, alcohol, volume,  caffeine);
                    Add_InventoryDB.AddDrinks(drinks);
                    Show_InventoryDB.ShowDrinksDB();
                    Write_audit.writeAudit("Add drink to cart");
                }
                case 6 -> { //Remove
                    cart.printCart();
                    System.out.println("To remove from cart write the id in the console.");
                    int id = scanner.nextInt();
                    cart.removeFromCart(cart.findId(id));
                    System.out.println("Your item was remove with success!");
                    Delete_InventoryDB.Delete(inventory, id);
                    Write_audit.writeAudit("Remove an item from cart");
                }
                case 7 -> { //show cart
                    cart.printCart();
                    Write_audit.writeAudit("Show the cart");
                }
                case 8 -> { //change amount
                    cart.printCart();
                    System.out.println("Write the ID of the item whose amount you want to modify.");
                    int id = scanner.nextInt();
                    cart.changeAmount(cart.findId(id));
                    System.out.println("Your amount was modified.");
                    Update_InventoryDB.ChangeAmount(inventory, id, cart.findId(id).getAmount(), cart.findId(id).getClass().toString());
                    Write_audit.writeAudit("Change amount");
                }
                case 9 -> { //Finish shopping session => empty cart
                    System.out.println("Thank you for choosing our services! Have a great day! :) ");
                    cart = new Cart();
                    Write_audit.writeAudit("Submit the order and finish empty the cart");
                }
                case 10 -> { //Exit
                    System.out.println("Bye! :) ");
                    option = 12;
                    Write_audit.writeAudit("Exit");
                    totalInventory(inventory);
                }
                case 11 -> { //print inventory with the basic information -> name, price(per piece), amount
                    printInventory(inventory);
                    Write_audit.writeAudit("Submit the order and finish empty the cart");
                }
            }
        }
        scanner.close();
    }

}
