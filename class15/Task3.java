package com.syntax.class15;

public class Task3 {
    public static void main(String[] args) {
       // Create a String that will hold a sentence. Write a program to get a new String without any spaces.

        String sentence = "This is too easy!";
        System.out.println(sentence);
        String newString=sentence.replaceAll(" ", "");
        System.out.println(newString);
        System.out.println(sentence);

    }
}
