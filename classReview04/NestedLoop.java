package com.syntax.classReview04;

public class NestedLoop {

    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            System.out.println("i am outer loop i will run 2 times value of i "+i);
            for (int j = 0; j < 2; j++) {
                System.out.println("i am 1st inner loop i will run 2*2=4 times i= "+i+" j= "+j);
                for (int k = 0; k < 2; k++) {
                    System.out.println("i am 2nd inner loop i will run 2*2*2=4 times value of i= "+i+" j= "+j+" k="+k);

                }
            }

        }
    }
}
