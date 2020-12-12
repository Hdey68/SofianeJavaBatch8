package com.syntax.class33;

import java.util.HashMap;

public class MapDemo1 {
    public static void main(String[] args) {

        HashMap<Integer,String> map=new HashMap<>();

        map.put(111,"Jack");
        map.put(111,"Vladimir");
        map.put(111,"Maria");
        map.put(111,"Danis");
        map.put(111,"Daria");
        map.put(111,"Jassor");

        System.out.println(map); //only one value will be stored in the map because we are providing the same key again and again
    }
}
