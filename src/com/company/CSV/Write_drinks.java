package com.company.CSV;

import java.io.FileWriter;
import java.io.IOException;

public class Write_drinks {
    private final static String path = "src/com/company/Files/drinks.csv";

    public static void writeDrinks(String name, double price, int amount, float alcohol, int volume, String caffeine) {
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter((path), true);

            String stringBuilder = name +
                    "," +
                    price +
                    "," +
                    amount +
                    "," +
                    alcohol +
                    "," +
                    volume +
                    "," +
                    caffeine +
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
