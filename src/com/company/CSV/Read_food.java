package com.company.CSV;

import com.company.Models.Food;
import com.company.Models.Items;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Read_food {
    private final static String path = "src/com/company/Files/food.csv";

    public  static void ReadFoof(ArrayList<Items> items) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            String line = bufferedReader.readLine(); //skip the first line
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                items.add(new Food(strings[0], Double.parseDouble(strings[1]), Integer.parseInt(strings[2]), strings[3], strings[4]));
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
