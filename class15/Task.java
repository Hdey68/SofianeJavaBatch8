package com.syntax.class15;

public class Task {
    public static void main(String[] args) {
        // You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
        // How would you find out how many sentences are in that String


        String a = "Is it saturday? Is it raining? Do we have a Java Class today?";

        int sentenceCount = 0;

        String[] sentenceList = a.split("[!?.:]+");

        sentenceCount += sentenceList.length;

        System.out.println("Total number of sentences = "+sentenceCount);

    }
}
