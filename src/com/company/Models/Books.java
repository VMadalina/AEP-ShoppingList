package com.company.Models;

public class Books extends Items {
    // Instance Variables
    private String author;
    private String genre;

    //Constructor
    public Books(String name, String author, double price, int amount, String genre) {
        super(name, price, amount);
        this.author = author;
        this.genre = genre;
    }

    //Getter and setter for author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    //Getter and setter for genre
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}
