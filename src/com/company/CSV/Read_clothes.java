package com.company.CSV;

import com.company.Models.Clothes;
import com.company.Models.Items;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Read_clothes {
    private final static String path = "src/com/company/Files/clothes.csv";

    public  static void ReadClothes(ArrayList<Items> items) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            String line = bufferedReader.readLine(); //skip the first line
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                items.add(new Clothes(strings[0], strings[1], strings[2], Double.parseDouble(strings[3]), Integer.parseInt(strings[4])));
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
