package com.syntax.class37;

public class BankAccount {

    public static double balance=10;
    public static void transferBalance(double transferAmount) throws InsufficientBalanceException {
        if(transferAmount>balance){
            throw new InsufficientBalanceException("Not enough balance");
        }
    }
}
