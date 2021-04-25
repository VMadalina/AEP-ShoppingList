package com.company.CSV;

import java.io.FileWriter;
import java.io.IOException;

public class Write_clothes {
    private final static String path = "src/com/company/Files/clothes.csv";

    public static void writeClothes(String name, String size, String color, double price, int amount) {
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter((path), true);

            String stringBuilder = name +
                    "," +
                    size +
                    "," +
                    color +
                    "," +
                    price +
                    "," +
                    amount +
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
