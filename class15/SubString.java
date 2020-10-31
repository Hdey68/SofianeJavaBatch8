package com.syntax.class15;

public class SubString {
    public static void main(String[] args) {
        String name = "Can u write the second m too ?";
        System.out.println(name.substring(10)); // first 10 characters will be ignored
        System.out.println(name.substring(0)); //redundant
        // System.out.println(name.substring(-1)); //Error

        System.out.println(name.substring(5, 10)); //Can u will be ignored
        System.out.println(name.substring(6, 11) + name.substring(15, 22));
    }
    }
