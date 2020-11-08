package com.syntax.class17;

public class Task3 {
    /*
   Create  class Student that will have a method getGrade.
   Your method should accept the score of a student and return a grade:
score > 90 - A
score >80 - B
score >70 - C
score > 50 - D
anything else - F
    */
    char getGrade(int marks) {
        char grade = 'F';
        if (marks >= 90 && marks <= 100) {
            grade = 'A';
        } else if (marks >= 80 && marks < 90) {
            grade = 'B';
        } else if (marks >= 70 && marks < 80) {
            grade = 'C';
        } else if (marks >= 60 && marks < 70) {
            grade = 'D';
        }

        return grade;
    }


    public static void main(String[] args) {
        Task3 task3 = new Task3();
        System.out.println(" task3.getGrade(90) " + task3.getGrade(90));
        System.out.println(" task3.getGrade(101) " + task3.getGrade(101));
        System.out.println(" task3.getGrade(40) " + task3.getGrade(40));
        System.out.println(" task3.getGrade(70) " + task3.getGrade(70));
        System.out.println(" task3.getGrade(-1) " + task3.getGrade(-1));
    }
}
