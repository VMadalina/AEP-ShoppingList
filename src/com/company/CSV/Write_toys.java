package com.company.CSV;

import java.io.FileWriter;
import java.io.IOException;

public class Write_toys {
    private final static String path = "src/com/company/Files/Toys.csv";

    public static void writeToys(String name, double price, int amount, String genre, String material, int age) {
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter((path), true);

            String stringBuilder = name +
                    "," +
                    price +
                    "," +
                    amount +
                    "," +
                    genre +
                    "," +
                    material +
                    "," +
                    age +
                    "\n";
            fileWriter.write(stringBuilder);
            fileWriter.flush();
            fileWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
