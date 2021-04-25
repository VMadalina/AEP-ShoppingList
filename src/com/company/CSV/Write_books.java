package com.company.CSV;

import java.io.FileWriter;
import java.io.IOException;

public class Write_books {
    private final static String path = "src/com/company/Files/books.csv";

    public static void writeBook(String name, String author, double price, int amount, String genre) {
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter((path), true);

            String stringBuilder = name +
                    "," +
                    author +
                    "," +
                    price +
                    "," +
                    amount +
                    "," +
                    genre +
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
