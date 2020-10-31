package com.syntax.class15;

public class Task5 {
    public static void main(String[] args) {
       // You have a String a=”Is it saturday? Is it raining?
        // Do we have a Java Class today?” How would you find out how many sentences are in that String

        String sen = "Is it saturday? Is it raining? Do we have a Java Class today?";
        System.out.println(sen);
        System.out.println(sen.replaceAll("[\\sA-Za-z0-9]", ""));
        System.out.println(sen.replaceAll("[\\sA-Za-z0-9]", "").length());

    }
}
