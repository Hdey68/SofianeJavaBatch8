package com.syntax.class14;

public class lengthMethod {
    public static void main(String[] args) {

        String name = "quasim";
        System.out.println(name.length());
        name = "";
        System.out.println(name.length());
        name = "Ahmed Qasim";
        System.out.println(name.length());
        name = "  Quasim   ";
        System.out.println(name.length());

        if (name.length() > 10) {
            System.out.println("you are great");

        }
    }
}

