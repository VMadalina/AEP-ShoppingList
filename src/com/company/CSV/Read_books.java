package com.company.CSV;

import com.company.Models.Books;
import com.company.Models.Items;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Read_books {
    private final static String path = "src/com/company/Files/books.csv";

    public  static void ReadBook(ArrayList<Items> items) {
        BufferedReader bufferedReader;
        try {
             bufferedReader = new BufferedReader(new FileReader(path));
             String line = bufferedReader.readLine(); //skip the first line
             while ((line = bufferedReader.readLine()) != null) {
                 String[] strings = line.split(",");
                 items.add(new Books(strings[0],strings[1], Double.parseDouble(strings[2]), Integer.parseInt(strings[3]), strings[4]));
             }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
