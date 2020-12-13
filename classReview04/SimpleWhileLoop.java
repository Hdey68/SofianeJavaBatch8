package com.syntax.classReview04;

public class SimpleWhileLoop {

    public static void main(String[] args) {
        //while loops the easiest of all
        //lets say i have to print the first 10 numbers using while loops
        //how while loops work until the condition is not true
        int var = 0;  // save different values from 0 to 20 show them how it works
        //debug and show how it works

        while (var <= 10) {
            System.out.println(" var in increasing order" + var);
            var++; // why am i doing this is it necessary to use this to work with loops
            //can i do it outside of the loop
        }
        // var++;

        // how to print in the reverse
        var = 10;
        while (var >= 0) {
            System.out.println(" var in decreasing order" + var);

            var--;
        }
        var = 10;
        while (var >= 0) {
            if (var < 5) {
                System.out.println(" var in decreasing order" + var);

            } else {
                System.out.println(" value is greater then 5");
            }
            var--;
        }
    }
}
