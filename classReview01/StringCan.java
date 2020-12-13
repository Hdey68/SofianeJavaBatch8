package com.syntax.classReview01;

public class StringCan {

    public static void main(String[] args) {
        String firstName = "Moneer";
        String lastName = "Fazly";
        String result = lastName + 5;
        System.out.println(result);
        result = lastName + 5.0;
        System.out.println(result);
        result = lastName + true;
        System.out.println(result);
        result = lastName + 'C';
        System.out.println(result);

        char c='A';
        System.out.println(c);
        System.out.println((int)c);
        System.out.println('A' + 5 + "name" + 'C' + 45);
        System.out.println(5 + 5 + "name" + 'C' + 45);
        System.out.println(5.0 + 5 + "name" + 'C' + 45);
        System.out.println(5 + 5 + "name" + 'C' + true);

        int smiley=9786;
        System.out.println((char)smiley);


    }
}


