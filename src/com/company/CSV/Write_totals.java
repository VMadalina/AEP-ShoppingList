package com.company.CSV;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Write_totals {
    private final static String path = "src/com/company/Files/totals.csv";

    public static void writeTotals(double books, double toys, double clothes, double drinks, double food, double total) {
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter((path), true);
            Date date= new Date();
            String stringBuilder = books +
                    "," +
                    toys +
                    "," +
                    clothes +
                    "," +
                    food +
                    "," +
                    drinks +
                    "," +
                    food +
                    "," +
                    total +
                    "," +
                    date +
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
