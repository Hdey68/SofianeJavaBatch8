package com.syntax.class28;

public  class ChildClass implements MyInterface,MyInterface2{
    @Override
    public void printInfo() {
        System.out.println(" My name is Muhammad Fahim and i am a quantum computer engineer");
    }

    @Override
    public void printAddress() {
        System.out.println("");
    }

    @Override
    public void printNameAndAddress() {

    }
}