package com.learning.core.Day6;

import java.util.TreeSet;

class Book2 implements Comparable<Book2> {
    private int bookId;
    private String title;
    private double price;
    private String author;
    private String dateOfPublication;

    public Book2(int bookId, String title, double price, String author, String dateOfPublication) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.author = author;
        this.dateOfPublication = dateOfPublication;
    }

    // Getters and setters

    @Override
    public String toString() {
        return bookId + " " + title + " " + price + " " + author + " " + dateOfPublication;
    }

    @Override
    public int hashCode() {
        return bookId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Book2 book2 = (Book2) obj;
        return bookId == book2.bookId;
    }

    public int compareTo(Book2 other) {
        return this.author.compareTo(other.author);
    }
}
public class D06P04  {
    public static void main(String[] args) {
        TreeSet<Book2> bookSet = new TreeSet<>();

        // Add predefined information of 5 Book details
        bookSet.add(new Book2(1001, "Python Learning", 715.0, "Martic C. Brown", "2/2/2020"));
        bookSet.add(new Book2(1002, "Modern Mainframe", 295.0, "Sharad", "19/5/1997"));
        bookSet.add(new Book2(1003, "Java Programming", 523.0, "Gilad Bracha", "23/11/1984"));
        bookSet.add(new Book2(1004, "Read C++", 295.0, "Henry Harvin", "19/11/1984"));
        bookSet.add(new Book2(1005, ".Net Platform", 3497.0, "Mark J. Price", "6/3/1984"));

        // Print all the Book details sorted by author names in ascending order
        for (Book2 book2 : bookSet) {
            System.out.println(book2);
        }
    }
}