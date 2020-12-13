package com.syntax.classReview02;

public class NestedIfElse {

    public static void main(String[] args) {
        /*
        lets try to simulate a real life scenario
        you have a bank account and you want to transfer some
        amount to your friend
        now tell me guys if i use simple if conditions or ifelse condition will
        it work this way
        whenever you see an hierarchy one condition is dependent on another
        you should use nested if else
         */

        String name = "Asghar";
        String password = "pass123";
        double accountBalance = 1000;
        double transferAmount = 800;
        boolean transAllowed = true;
        if (password.equals("pass123")) {
            System.out.println("welcome to Syntax Bank");
            System.out.println("initiating transfer");
            if (transAllowed) {
                System.out.println("checking available balance");
                if (accountBalance >= transferAmount) {
                    System.out.println("Transfer Completed successfully");
                } else {
                    System.out.println("Insufficient balance please try again");
                }
            } else {
                System.out.println("Sorry you are not allowed to transfer");

            }

        } else {
            System.out.println("Invalid credentials please try again");
        }

       /* we can not use simple if conditions what if we have to print an message in case of error
        only way forward is nested if else*/


        if(password.equals("pass123")){
            System.out.println("welcome to Syntax Bank");
            System.out.println("initiating transfer");
        }
        if(transAllowed){
            System.out.println("checking available balance");
        }

        //if else conditions  does it make sense to use ifelse no
        if(password.equals("pass123")){
            System.out.println("welcome to Syntax Bank");
            System.out.println("initiating transfer");
        }else if(transAllowed){
            System.out.println("checking available balance");
        }

        //does it make more sense if i use real life examples like this ?


    }

}
