package com.syntax.classReview02;

public class IfCondition {

    public static void main(String[] args) {

//show them by chnaging the value of the variable a
        int a = 10;

        if (a > 0) {
            System.out.println ( "This code will only be executed if a holds a number larger than 0" );
            System.out.println ( "Number is greater than 0" );
        }
        System.out.println ( "this statement will be executed always" );

        String jiraPassword = "pass123";
        System.out.println ( "Line above if condition This statement will be executed always" );
        // only one block is executed in if else
        if (jiraPassword.equals ( "pass123" )) {
            System.out.println ( "Welcome to Jira" );

        } else {
            System.out.println ( "Please contact Adam" );
        }
        System.out.println ( "Line below if condition This statement will be executed always" );
//only one will be executed at a time
        int number = -13;
        if (number > 0) {
            System.out.println ( "POSITIVE" );
        } else if (number < 0) {
            System.out.println ( "NEGATIVE" );
        } else {
            System.out.println ( "ZERO" );
        }

        // we can also leave the last else

        int number2 = -13;
        if (number > 0) {
            System.out.println ( "POSITIVE" );
        } else if (number < 0) {
            System.out.println ( "NEGATIVE" );
        }
    }
    }
