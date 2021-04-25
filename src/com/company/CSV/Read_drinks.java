package com.company.CSV;

import com.company.Models.Drinks;
import com.company.Models.Items;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Read_drinks {
    private final static String path = "src/com/company/Files/drinks.csv";

    public static void ReadDrinks(ArrayList<Items> items) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            String line = bufferedReader.readLine(); //skip the first line
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                items.add(new Drinks(strings[0], Double.parseDouble(strings[1]), Integer.parseInt(strings[2]), Float.parseFloat(strings[3]), Integer.parseInt(strings[4]), Boolean.parseBoolean(strings[5])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}