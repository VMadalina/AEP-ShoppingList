package com.company;

public class Books extends Items {

    // Instance Variables
    private String author;
    private int numberPages;
    private String genre;

    //Constructor
    public Books(String name, double price, int amount, String author, int numberPages, String genre) {
        super(name, price, amount);
        this.author = author;
        this.numberPages = numberPages;
        this.genre = genre;
    }

    //Getter and setter for author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    //Getter and setter for number of pages
    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    //Getter and setter for genre
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
