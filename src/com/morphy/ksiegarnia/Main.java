package com.morphy.ksiegarnia;

public class Main {
    public enum typeEnum {LANG, TECH, LAW, HIST}

    public static void main(String[] args) {
        /* Tworzenie nowej instancji klasy Bookstore */

        Bookstore b = new Bookstore();
        int[] income = {100, 20, 59, 200, 78, 60};

        /* Ustawienie wartości pól */

        b.setAddress("ul. Mickiewicza 21/23 80-289 Gdańsk");
        b.setIncome(income);
        b.setType(typeEnum.TECH);

        /* Wywołanie metod dotyczących najwyższego i zsumowanego dochodu */

        System.out.println("Najwyższy dochód: " + b.getTopIncome());
        System.out.println("Suma dochodów z n miesięcy: " + b.getIncomeSum(3));

        /* Wywołanie metody tworzącej nową książkę z podaną przez użytkownika ilością stron */

        Book book1 = b.createBook(true);

        /* Wywołanie metody tworzącej nową książkę bez podanej przez użytkownika ilości stron */

        Book book2 = b.createBook(false);
    }
}
