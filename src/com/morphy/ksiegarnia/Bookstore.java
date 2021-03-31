package com.morphy.ksiegarnia;

import java.util.Scanner;
import java.util.Random;

public class Bookstore {
    /* Pola */

    private String address;
    private int[] income;
    private Main.typeEnum Type;

    /* Gettery i Settery */

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int[] getIncome() {
        return income;
    }

    public void setIncome(int[] income) {
        this.income = income;
    }

    public Main.typeEnum getType() {
        return Type;
    }

    public void setType(Main.typeEnum type) {
        Type = type;
    }

    /* Konstruktor */

    public Bookstore() {

    }

    /* Metody dotyczące dochodu */

    public int getTopIncome() {
        int max = this.income[0];

        for (int i = 0; i < this.income.length; i++) {
            if(this.income[i] > max) max = this.income[i];
        }

        return max;
    }

    public int getIncomeSum(int n) {
        int sum = 0;

        for(int i = this.income.length - n; i < this.income.length; i++) {
            sum += this.income[i];
        }

        return sum;
    }

    /* Metoda dotycząca tworzenia książki */

    public Book createBook(boolean pagesGiven) {
        Scanner input = new Scanner(System.in);

        if(pagesGiven) {
            System.out.println("title: ");
            String title = input.nextLine();

            System.out.println("pages: ");
            int pages = input.nextInt();

            System.out.println("price: ");
            int price = input.nextInt();

            Book b = new Book(title, pages, price);
            b.getBookInfo();
            return b;
        } else {
            System.out.println("title: ");
            String title = input.nextLine();

            Random random = new Random();
            int pages = random.nextInt(50) + 1;

            System.out.println("price: ");
            int price = input.nextInt();

            Book b = new Book(title, pages, price);
            b.getBookInfo();
            return b;
        }
    }
}