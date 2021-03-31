package com.morphy.ksiegarnia;

public class Book {
    /* Pola */

    private String title;
    private int pages;
    private int price;

    /* Gettery i Settery */

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    /* Konstruktor 1 */

    public Book(String title, int pages, int price) {
        this.title = title;
        this.pages = pages;
        this.price = price;
    }

    /* Konstruktor 2 (overloading/przeciążanie konstruktora) */

    public Book(String title) {
        this.title = title;
    }

    /* Wyświetlenie informacji o książce */

    public void getBookInfo() {
        System.out.println("Książka " + this.title + " ma " + this.pages + " stron i kosztuje " + this.price);
    }
}
