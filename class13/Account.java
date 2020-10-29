package com.syntax.class13;

public class Account {

    String accountId;
    String userName;
    String password;
    double balance;
    String typeOfAccount;
    double limit;

    /*
    write a method that takes the amount that user wants to
     transfer it deducts the amount from your balance and
    returns the amount of transfer in case of success or a 0
    in case of failure
     */

    double amountTransfer(double amountToTransfer) {
        if(amountToTransfer<balance) {
            return balance=balance-amountToTransfer;
        }else {
            return 0;
        }
    }

    boolean login(String enteredUserName, String enteredpassword) {
        if (userName.equals(enteredUserName) &&
                password.equals(enteredpassword)) {
            return true;
        } else {
            return false;
        }


    }
}

