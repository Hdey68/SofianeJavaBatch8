package com.syntax.class29;

public class Employee implements PrintInfo{
    @Override
    public void printName() {
        System.out.println(" Ali");
    }

    @Override
    public void printPhoneNumber() {
        System.out.println("123456789");
    }

    @Override
    public void printAddress() {
        System.out.println(" Bla bla bla");
    }

    @Override
    public void payFee() {

    }
}