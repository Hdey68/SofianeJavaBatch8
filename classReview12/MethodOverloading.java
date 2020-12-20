package com.syntax.classReview12;

import java.util.ArrayList;

public class MethodOverloading {

    public void addPrint(int num1, int num2) {
        System.out.println("results " + (num1 + num2));
    }

    public void addPrint(String num1, String num2) {
        System.out.println("results " + (Double.parseDouble(num1) + Double.parseDouble(num2)));
    }
    public void addPrint(double num1, String num2) {
        System.out.println("results " +( num1 + Double.parseDouble(num2)));
    }

    public void addPrint( String num1, double num2) {
        System.out.println("results " +( num2 + Double.parseDouble(num1)));
    }
    public void addPrint( double num1, double num2,double num3) {
        System.out.println("results " +(num1+num2+num3 ));
    }

    public void addPrint( int... num1) {
        int sum = 0;
        for (int num : num1
        ) {
            sum = sum + num;
        }
        System.out.println("results " + sum);

    }


    public void addPrint(double num1, double num2) {
        System.out.println("results " + (num1 + num2));
    }



    public void addPrint(ArrayList<Integer> numArr) {
        int sum = 0;
        for (int num : numArr
        ) {
            sum = sum + num;
        }
        System.out.println("results " + sum);
    }
}
