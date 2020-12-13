package com.syntax.classReview03;

import java.util.Scanner;

public class LogicalOperators {

     /*
    logical operators are used to combine multiple conditions
    in a single if conditions
     */
    public static void main(String[] args) {
       /*
       what are logical operators
       and or and Not
       and only tru if all the conditions are true
       or is true any one of the condition is tru
        */
        String day="Sunday";
        if(day.equals("Saturday")){
            System.out.println("Relax its the weekend just don't blink or it will be over");
        }else if(day.equals("Sunday")){
            System.out.println("Relax its the weekend just don't blink or it will be over");

        }else {
            System.out.println("I have to go to work");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter an Integer number ");
        int number = scanner.nextInt();

        if (number >= 0) {
            if (number <= 100) {
                System.out.println("Number is between 1 and 100");

            } else {
                System.out.println("Number is less than 0 or greater than 100");
            }
        } else {
            System.out.println("Number is less than 0 or greater than 100");
        }
        if (day.equals("Saturday") || day.equals("Sunday")){
            System.out.println("Relax its the weekend just don't blink or it will be over");
        }else {
            System.out.println("I have to go to work");
        }

        //is not it nicer but does it mean then nested if else are useless?
        if (number >= 0 && number <= 100) {
            System.out.println("Number is between 1 and 100");
        } else {
            System.out.println("Number is less than 0 or greater than 100");
        }
        /*
        take this example of logging into bank application
        does it make sense to ask user to tell us the amount to
        be transferred from its account before he/she has logged into the
        account No
        Here nested if else will make more sense
        does it make sense to take the input before the password or with the password
         */
        String password = scanner.nextLine();
        double accountBalance = 1000;

        if (password.equals("pass123")) {
            System.out.println("welcome to Syntax Bank");
            System.out.println("Enter the amount to be transferred");
            double transferAmount = scanner.nextDouble();
            if (transferAmount > accountBalance) {
                System.out.println("insufficient balance try again");
            } else {
                System.out.println("Transfer complete");
            }
        } else {
            System.out.println("wrong password try again");
        }
        //Not operators are sometime very useful to simplify yor logic
        int a = 10;
        int b = 20;
        if (b != 0) {
            System.out.println("output is " + a / b);
        }
        if (b == 0) {
        } else {
            System.out.println("output is " + a / b);
        }
    }
}
