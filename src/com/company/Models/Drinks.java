package com.company.Models;

public class Drinks extends Items {
    private double alcVol;
    private int volume;
    private String caffeine;

    //Constructor
    public Drinks(String name, double price, int amount, float alcVol, int volume, String caffeine) {
        super(name, price, amount);
        this.alcVol = alcVol;
        this.volume = volume;
        this.caffeine = caffeine;
    }

    //Getter and setter for alcohol volume
    public double getAlcVol() {
        return alcVol;
    }

    public void setAlcVol(float alcVol) {
        this.alcVol = alcVol;
    }

    //Getter and setter for volume
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    //Getter and setter for caffeine
    public String isCaffeine() {
        return caffeine;
    }

    public void setCaffeine(String caffeine) {
        this.caffeine = caffeine;
    }
}
