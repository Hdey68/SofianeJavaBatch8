package com.syntax.class14;

public class ToLowerCaseMethod {
    public static void main(String[] args) {
        String name = "Ali Kursun";
        System.out.println(name.toLowerCase());

        name = "ali kursun";
        System.out.println(name.toLowerCase());
        name = "ALI KURSUN";
        String name2 = name.toLowerCase();
        System.out.println();
        System.out.println(name);
        System.out.println(name2);
    }
}
