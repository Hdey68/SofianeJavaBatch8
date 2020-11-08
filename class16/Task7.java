package com.syntax.class16;

import java.util.Scanner;

public class Task7 {
    //Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
    //score > 90 - A
    //score >80 - B
    //score >70 - C
    //score > 50 - D
    //anything else - F (edited)

    public static char getGrade(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80 && score < 90) {
            return 'B';
        } else if (score >= 70 && score < 80) {
            return 'C';
        } else if (score >= 50 && score < 70) {
            return 'D';
        } else {
            return 'F';
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your score");
        int score= input.nextInt();
        char getGrade=getGrade(score);
        System.out.println(getGrade(score));
    }
}
