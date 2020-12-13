package com.syntax.classReview04;

public class ForLoops {

    public static void main(String[] args) {
        // explain by debugging and showing each step
        int sum=0;
        for (int i = 1; i < 11; i++) {
            System.out.println(" sum till "+i+"= " + (sum=sum+i));
        }

        System.out.println();
        sum=0;
        //printing reverse
        for (int i = 10; i > 0; i--) {
            System.out.println(" sum till "+i+"= " + (sum=sum+i));
        }

    }
}
