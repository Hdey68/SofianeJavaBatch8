package com.syntax.class15;

public class Task6 {
    public static void main(String[] args) {
        //How would you reverse a String character by character?

        String a="String";
        String reverse="";
        int i;
        for(i=a.length()-1; i>=0; i--){
            reverse=reverse+a.charAt(i);
        }
        System.out.print("The reverse string character by character is:  ");
        System.out.println(reverse);
    }
}
