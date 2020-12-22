package com.syntax.classReview14;

public class ConstOverlDemo {

    //overloading the constructor
    String firstName;
    String lastName;
    int age;
    double salary;

    ConstOverlDemo() {
        this.firstName = "";
        this.lastName = "";
        this.age = 20;
        this.salary = 100000;
        System.out.println("Default Constructor with no parameters called");
    }

    ConstOverlDemo(String firstName) {
        this();
        this.firstName = firstName;
        System.out.println("Constructor with firstname called");
    }

    ConstOverlDemo(String firstName, String lastName) {
        this(firstName);
        this.lastName = lastName;
        System.out.println("Constructor with firstname and lastName called");
    }
    ConstOverlDemo(String firstName, String lastName, int age) {
        this(firstName,lastName);
        this.age=age;
        System.out.println("Constructor with firstname , lastName and age called");
    }

    void printInfo(){
        System.out.println(firstName+" "+lastName+" "+ age+" "+salary);
    }

}
