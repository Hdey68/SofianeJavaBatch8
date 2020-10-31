package com.syntax.class15;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        //How would you check if String is palindrome or not?


        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string you want to check:");

        String word = input.next();

        String reverse = new StringBuffer(word).reverse().toString();

        if (word.equals(reverse)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}

