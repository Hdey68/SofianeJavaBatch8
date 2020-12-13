package com.syntax.classReview02;

import java.util.Scanner;

public class Debugging {

    //show them how important brackets are
    //show them i printing statements with vars can help them
    // check the flow
    //show them how break points can be skipped
    //show them if you do not close your sessions
    //there will be mess
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.println("Please enter your gender: M or F");
        char gender = userIn.next().charAt(0);
        System.out.println("Please enter your age?");
        int age = userIn.nextInt();
        if (gender == 'M') {
            if (age > 25) {
                System.out.println("Man");
            } else {
                System.out.println("Boy");
            }
            if (gender == 'F') {
                if (age > 25) {
                    System.out.println("Woman");
                } else {
                    System.out.println("Girl");
                }
            }
        }
    }
}

