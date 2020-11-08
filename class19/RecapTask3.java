package com.syntax.class19;

public class RecapTask3 {
    /*
   Create a method that will accept a String as a parameter and return a
   new String that consist only of vowels. Method should be available
   inside the class only where it was declared and executed by calling
   it's name.
    */
    private static String vowelsOnly(String name){
        return name.replaceAll("[^AEIOUaeiou]","");
    }

    public static void  main(String[] args) {
        System.out.println(vowelsOnly("all the vowels will be removed"));
    }
}
