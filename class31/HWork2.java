package com.syntax.class31;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HWork2 {
    /*
    Create a Set of cities in which you want to make sure that insertion order is maintained.
    Then remove any city that starts with “A”;
     */
    public static void main (String[] args) {
        Set<String> city=new LinkedHashSet<> ();
        city.add("Algiers");
        city.add("Casablanca");
        city.add("Mecca");
        city.add("damascus");
        city.add("Bagdad");
        city.add("Al paso");
        city.add("kabul");
        city.add ( "Alicante" );
        System.out.println ("before removal" );
        System.out.println(city);
        System.out.println ("After removal" );
        Iterator<String> iterator = city.iterator();
        while (iterator.hasNext()){
            if(iterator.next().startsWith("A")){
                iterator.remove();
            }
        }
        System.out.println(city);
    }
}


