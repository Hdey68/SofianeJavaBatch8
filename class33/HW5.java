package com.syntax.class33;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HW5 {
    /*
    Create a Map from array of cities that will sort keys in alphabetical order.
    As a key store the name of the city and as a value store the length of the city
    (Example: Paris=5, Moscow =6, Washington DC=13 etc..).
    If any city name is more than 7 characters remove that city .
     */
    public static void main (String[] args) {
        String[] arrayCity = {"Rabbat", "Algiers", "Casablanca", "Taiwan", "Madrid", "Paris", "Adissabeba", "San francisco"};
        Map<String, Integer> map = new TreeMap<> ( );
        for (int i = 0; i < arrayCity.length; i++) {
            map.put ( arrayCity[i], arrayCity[i].length ( ) );
        }
        System.out.println ( map );
        Set<Map.Entry<String, Integer>> set = map.entrySet ( );
        Iterator<Map.Entry<String, Integer>> iterator = set.iterator ( );
        while (iterator.hasNext ( )) {
            Map.Entry<String, Integer> element = iterator.next ( );
            if (element.getValue ( ) >= 7) {
                iterator.remove ( );
            }
            }
            System.out.println (map );
        }
    }
