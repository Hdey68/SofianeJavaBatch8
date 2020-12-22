package com.syntax.class37;

public class BankAccountTester {

    public static void main(String[] args) {
        try {
            BankAccount.transferBalance(20);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error handled");
            e.printStackTrace();
        }
    }
}
