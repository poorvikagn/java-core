package com.learning.core.Day1;

import java.util.Scanner;

class Book {
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



    public static Book createBooks() {
        Scanner scanner = new Scanner(System.in);
        Book book = new Book();
        System.out.println("Enter book title:");
        String title = scanner.nextLine();
        System.out.println("Enter book price:");
        double price = scanner.nextDouble();
        scanner.nextLine(); 
        book.setBookTitle(title);
        book.setBookPrice(price);
        return book;
    }

    public static void showBooks(Book book) {
        System.out.println("Book Title: " + book.getBookTitle() + " and Price: " + book.getBookPrice());
    }

    public static void main(String[] args) {
        Book book1 = createBooks();
        showBooks(book1);
    }
}