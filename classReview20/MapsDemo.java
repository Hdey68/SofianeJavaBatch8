package com.syntax.classReview20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapsDemo {

    public static void main (String[] args) {

        HashMap<String, Double> hashMap = new HashMap<> ( );
        hashMap.put ( "Eggs", 12.99 );
        hashMap.put ( "Milk", 10.0 );
        hashMap.put ( "Cake", 20.0 );
        System.out.println (hashMap );

        hashMap.entrySet ( ).removeIf ( element -> element.getValue ( ) > 10 );
        System.out.println (hashMap );
    }
}