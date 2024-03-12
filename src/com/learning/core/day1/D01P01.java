package com.learning.core.Day1;

import java.util.Scanner;

class D01P01 {
    private String bookTitle;
    private double bookPrice;

    public void setBookTitle(String title) {
        this.bookTitle = title;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public void setBookPrice(double price) {
        this.bookPrice = price;
    }

    public double getBookPrice() {
        return this.bookPrice;
    }



    public static D01P01 createBooks() {
        Scanner scanner = new Scanner(System.in);
        D01P01 book = new D01P01();
        System.out.println("Enter book title:");
        String title = scanner.nextLine();
        System.out.println("Enter book price:");
        double price = scanner.nextDouble();
        scanner.nextLine(); 
        book.setBookTitle(title);
        book.setBookPrice(price);
        return book;
    }

    public static void showBooks(D01P01 book) {
        System.out.println("Book Title: " + book.getBookTitle() + " and Price: " + book.getBookPrice());
    }

    public static void main(String[] args) {
        D01P01 book1 = createBooks();
        showBooks(book1);
    }
}