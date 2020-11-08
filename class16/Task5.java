package com.syntax.class16;

public class Task5 {
    //Create a method createEmail(). Based on values of users name, lastName and email type,
    // your method should return complete email Address.
    // Example:  createEmail(John, Snow, gmail) →johnsnow@gmail.com


    static void createEmail(String userName, String lasName, String emailType){
        System.out.println(userName+lasName+"@"+emailType+".com");
    }
    public static void main(String[] args) {
        createEmail("john","snow","gmail");
    }
}

