package com.syntax.classReview01;

import java.util.Scanner;

public class ScannerClass {


    public static void main (String[] args) {

        String name;
        int age;
        Scanner scanner = new Scanner ( System.in );
        System.out.println ( "Please enter your Name" );
        name = scanner.nextLine ( );
        System.out.println ( "Please enter your age" );
        age = scanner.nextInt ( );
        System.out.println ( "Hi " + name + " you are " + age + " years old" );
    }
}