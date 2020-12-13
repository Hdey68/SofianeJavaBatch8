package com.syntax.classReview06;

public class Book {

    private String bookName;
    private String title;
    private String author;
    private int year;
    private String ISBN;
    private boolean isAvailable;

    public Book(String bookName, String title, String author, int year, String ISBN, boolean isAvailable) {
        System.out.println("Initializing the "+bookName+" in the constructor");

        this.bookName = bookName;
        this.title = title;
        this.author = author;
        this.year = year;
        this.ISBN = ISBN;
        this.isAvailable = isAvailable;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
