package com.syntax.class19;

public class Student {

    String name;
    double subject1;
    double subject2;
    double subject3;
    /*
    Write a java program of Class Students that takes students name and 3
    subject grades. Inside your class also have a method to Calculate
    Average Grade. Test Student class for 5 different students with different marks.
    Your program should print an average mark of each students name.
    NOTE: please use different names for instance and local variables
     */

    Student(String name, double subject1, double subject2, double subject3) {
        this.name = name;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    void printGradeAverage() {
        double avg = (subject1 + subject2 + subject3) / 3;
        System.out.println("Average marks for " + name + " are " + avg);
    }

    void printsubject1Marks(){
        System.out.println("Marks in the subject 1 "+subject1);

    }


}
