package com.company.CSV;

import java.io.FileWriter;
import java.io.IOException;

public class Write_food {
    private final static String path = "src/com/company/Files/food.csv";

    public static void writeFood(String name, double price, int amount, String date, boolean vegetarian) {
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter((path), true);

            String stringBuilder = name +
                    "," +
                    price +
                    "," +
                    amount +
                    "," +
                    date +
                    "," +
                    vegetarian +
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
