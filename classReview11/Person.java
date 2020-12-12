package com.syntax.classReview11;

public abstract class Person {
    String name;
    static final String  species ="Homo sapiens";
    Person(String name){
        this.name=name;
        System.out.println("From Person Constructor");
    }

    final void sleep(){
        System.out.println("All Persons must sleep");
    }

    abstract void printInfo();
}

class Student extends  Person{

    String studentId;
    Student(String name,String studentId) {
        super(name);
        this.studentId=studentId;
        System.out.println("From Student Constructor");


    }

    @Override
    void printInfo() {
        System.out.println("Name "+name+" Id "+studentId);
    }
}



class Employee extends Person{

    String grade;
    String dept;
    Employee(String name,String grade,String dept) {
        super(name);
        this.grade=grade;
        this.dept=dept;
        System.out.println("From Employee Constructor");
    }

    @Override
    void printInfo() {
        System.out.println("Name "+name +" Grade "+grade+" Department "+dept);
    }
}