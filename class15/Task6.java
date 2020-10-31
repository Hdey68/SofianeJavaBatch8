package com.syntax.class15;

public class Task6 {
    public static void main(String[] args) {
        //How would you reverse a String character by character?

        String character="String";
        String reversedString="";
        int i;
        for(i=character.length()-1; i>=0; i--){
            reversedString=reversedString+character.charAt(i);
        }
        System.out.print("The reverse string character by character is:  ");
        System.out.println(reversedString);
    }
}
