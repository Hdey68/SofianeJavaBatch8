package com.syntax.class16;
import java.util.Scanner;
public class Task6BooleanMethod {
    //Write a method to return whether given number is prime or not?

     static boolean isItPrime(int number) {

        boolean isPrime = true;
         if(number<1) {
             isPrime = false;
             return isPrime;
         } else {
             for (int i = 2; i <= number / 2; i++) {
                 if (number % i == 0) {
                     isPrime = false;
                     break;
                 }
             }
             return isPrime;
         }
        }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");

        int number =input.nextInt();
        boolean isItPrime = isItPrime(number);

        if (isItPrime) {
            System.out.println(number+" is a prime number.");
        } else {
            System.out.println(number+" is not a prime number.");
        }
    }
}