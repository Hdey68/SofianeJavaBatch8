package com.syntax.classReview01;

import java.util.Scanner;

public class Temp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] num;
        double sum;
        sum = 0.0;
        int size;
        System.out.println("Please, tell me how many double values you want to enter");
        size = scan.nextInt();
        scan.nextLine();
        num = new double[size];
        for (int a = 0; a < size; a++) {
            System.out.println("Please enter your double values");
            num[a] = scan.nextDouble();
            scan.nextLine();
        }
        for (int a = 0; a < num.length; a++) {
            sum += num[a];
        }
        System.out.println("The sum of all double numbers is " + sum);


    }
}

