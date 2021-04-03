package com.company.Models;

public class Drinks extends Items {
    private float alcVol;
    private int volume;
    private boolean caffeine;

    //Constructor
    public Drinks(String name, double price, int amount, float alcVol, int volume, boolean caffeine) {
        super(name, price, amount);
        this.alcVol = alcVol;
        this.volume = volume;
        this.caffeine = caffeine;
    }

    //Getter and setter for alcohol volume
    public float getAlcVol() {
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
    public boolean isCaffeine() {
        return caffeine;
    }

    public void setCaffeine(boolean caffeine) {
        this.caffeine = caffeine;
    }
}
