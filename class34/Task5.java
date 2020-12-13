package com.syntax.class34;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task5 {
    /*
  Create the collection that will store single uniques Objects of a String type in which order is preserved.
  Write a logic to concatenate all string from the collection.
   */
    public static String wordsConcat(LinkedHashSet<String> setik) {
        String longWord = "";
        for (String word : setik) {
            longWord = longWord + word;
        }
        return longWord;
    }

    public static void main(String[] args) {
        LinkedHashSet<String> words = new LinkedHashSet<>();
        words.add("Hello");
        words.add("my");
        words.add("name");
        words.add("is");
        words.add("Denis");
        System.out.println(wordsConcat(words));
    }
}


