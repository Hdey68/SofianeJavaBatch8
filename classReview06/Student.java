package com.syntax.classReview06;

public class Student {

    String name;
    String rollNumber;
    int age;
    Book[] books;

    public Student(String name, String rollNumber, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        books=new Book[2];
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
