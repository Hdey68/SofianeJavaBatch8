package com.syntax.class15;

public class ReplaceAll {
    public static void main(String[] args) {
        String mix = "3213Hello 89 World354545 *&***^&*^&*";

        System.out.println(mix.replaceAll("[0-9]", ""));

        System.out.println(mix.replaceAll("[a-z]", ""));

        System.out.println(mix.replaceAll("[a-z A-Z]", ""));

        System.out.println(mix.replaceAll("[^A-Za-z0-9]", ""));

        System.out.println(mix.replaceAll("\\s+", ""));
    }

}
