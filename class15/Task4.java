package com.syntax.class15;

public class Task4 {
    public static void main(String[] args) {
        // Create a String that should be combination of letters, numbers and special characters.
        // Find out how many alpha characters are there in the String

        String a1 = "a 1 b 2 c 3 d & * ! @";
        System.out.println(a1);
        System.out.println(a1.replaceAll("[^0-9]", ""));
        System.out.println(a1.replaceAll("[^0-9]", "").length());
    }
}