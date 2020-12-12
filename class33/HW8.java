package com.syntax.class33;

import com.syntax.class30.collection;

import java.util.LinkedList;
import java.util.List;

public class HW8 {
    /*
    Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers
     */
    public static void main (String[] args) {


        List<Integer> collection = new LinkedList<> ( );
        collection.add (66);
        collection.add (25);
        collection.add (66);
        collection.add (15);
        collection.add (99);
        collection.add (02);
        int sum = 0;
        for (int i = 0; i < collection.size ( ); i++) {
            sum += collection.get ( i );
        }
        System.out.println (collection);
        System.out.println (sum);
    }
}////////////////////////////////////////////done//////////////////////////////////////////////////////////
