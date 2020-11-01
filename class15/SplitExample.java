package com.syntax.class15;

public class SplitExample {
    public static void main(String[] args) {
       // how can you find how many words are in the string?
        String subject="I love Java and I want to learn more";
        //Using space “ ” as a delimiter
        //Split returns an array of Strings
        String [] splitedSub = subject.split(" ");
        System.out.println(splitedSub.length);
        //Looping through the array to get all the values
        for (int i = 0; i< splitedSub.length; i++) {
            System.out.println(splitedSub[i]);
        }


    }
}
