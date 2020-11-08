package com.syntax.class16;

public class Task2 {
   // Create a method that will take a number and prints whether the number is even or odd.
    // Even numbers 2,4,6,8,10,12.....if a number is completely divisible by 2 it s an even number
    // if numbers are not divisible by 2 , they are odd 1,3,5,7,11,....

    void printNumberEvenOrOdd(double number){
        if(number%2==0) {
            System.out.println("Number is an even number");
        }else{
            System.out.println("Number is an odd number");
        }

    }
}
