package com.syntax.class16;

public class Task3 {
    // saShSas
    //    /*
    //    Create a method that will print whether given String is palindrome or not.
    //     */
       public void isStringpalindrome(String string) {
           int i = 0;
           int j = string.length() - 1;
           while (i < j) {

               if (string.charAt(i) != string.charAt(j)) {
                   System.out.println("String is not palindrome");
                   return;
               }
               i++;
               j--;
           }
           System.out.println("String is a palindrome");
       }
}
