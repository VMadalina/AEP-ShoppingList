package com.company.Services;

import com.company.Models.Items;

public interface Shopping_list {
    double getTotal();
    double totalCost();
    void changeAmount(Items item);
    void printCart();
    void addToCart (Items item);
    void removeFromCart (Items item);
    Items findId(int id);
}
