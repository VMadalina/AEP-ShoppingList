package com.company;

import java.util.Scanner;

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

    public void sizeHelper(int chest, int waist, int hip) {
        System.out.println("Choose your genre (F/M): ");
        Scanner scanner = new Scanner(System.in);
        String genre = scanner.next();
        scanner.close();

        if ("F".equals(genre)) {
            if ((chest >= 80 && chest <= 85) && (waist >= 60 && waist <= 65) && (hip >= 86 && hip <= 92))
                System.out.println("Your recommended size is XS.");
            else if ((chest >= 85 && chest <= 93) && (waist >= 65 && waist <= 72) && (hip >= 92 && hip <= 97))
                System.out.println("Your recommended size is S.");
            else if ((chest >= 93 && chest <= 99) && (waist >= 72 && waist <= 79) && (hip >= 98 && hip <= 105))
                System.out.println("Your recommended size is M.");
            else if ((chest >= 100 && chest <= 107) && (waist >= 80 && waist <= 87) && (hip >= 106 && hip <= 113))
                System.out.println("Your recommended size is L.");
            else if ((chest >= 108 && chest <= 112) && (waist >= 88 && waist <= 92) && (hip >= 114 && hip <= 118))
                System.out.println("Your recommended size is XL.");
            else if ((chest >= 123 && chest <= 130) && (waist >= 93 && waist <= 100) && (hip >= 119 && hip <= 126))
                System.out.println("Your recommended size is XXL.");
            else if ((chest >= 131) && (waist >= 100) && (hip >= 127))
                System.out.println("We don't have this number. Sorry :( ");
            else
                System.out.println("We couldn't find your size.");
        }
        else{
            if ((chest >= 78 && chest <= 82) && (waist >= 60 && waist <= 75) && (hip >= 75 && hip <= 84))
                System.out.println("Your recommended size is XS.");
            else if ((chest >= 83 && chest <= 88) && (waist >= 73 && waist <= 78) && (hip >= 85 && hip <= 90))
                System.out.println("Your recommended size is S.");
            else if ((chest >= 89 && chest <= 94) && (waist >= 79 && waist <= 84) && (hip >= 91 && hip <= 96))
                System.out.println("Your recommended size is M.");
            else if ((chest >= 95 && chest <= 100) && (waist >= 85 && waist <= 90) && (hip >= 97 && hip <= 102))
                System.out.println("Your recommended size is L.");
            else if ((chest >= 101 && chest <= 106) && (waist >= 91 && waist <= 96) && (hip >= 103 && hip <= 108))
                System.out.println("Your recommended size is XL.");
            else if ((chest >= 107 && chest <= 112) && (waist >= 97 && waist <= 102) && (hip >= 109 && hip <= 114))
                System.out.println("Your recommended size is XXL.");
            else if ((chest >= 113) && (waist >= 103) && (hip >= 115))
                System.out.println("We don't have this number. Sorry :( ");
            else
                System.out.println("We couldn't find your size.");
        }
    }
}
