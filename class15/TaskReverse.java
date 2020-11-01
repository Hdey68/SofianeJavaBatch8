package com.syntax.class15;

public class TaskReverse {
    public static void main(String[] args) {

        //Create a String and print it in reverse order (Sunday → yadnuS).

        String str="Sunday";
        String reversedString="";
        int i;
        for(i=str.length()-1; i>=0; i--){
            reversedString=reversedString+str.charAt(i);
        }
        System.out.println(reversedString);
    }
}
