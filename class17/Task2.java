package com.syntax.class17;

public class Task2 {
     /*
    Write a method to return whether given number is prime or not?
    what is a prime number
     */

    boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Task2 task2=new Task2();
        boolean prime = task2.isPrime(25);
        boolean prime1 = task2.isPrime(1);
        boolean prime2 = task2.isPrime(10);
        System.out.println("isPrime(25) "+prime);
        System.out.println("isPrime(1) "+prime1);
        System.out.println("isPrime(10) "+prime2);
    }
}
