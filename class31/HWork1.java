package com.syntax.class31;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HWork1 {
    /*
    Create a Set collection in which you need to add names of the countries.
    In this set we want all objects to be sorted in alphabetical order.
    Using 2 different ways retrieve all elements from set.
     */
    public static void main (String[] args) {
        Set<String> country = new TreeSet<> ( );
        country.add ( "Algeria" );
        country.add ( "Morocco" );
        country.add ( "Saudi Arabia" );
        country.add ( "Turkey" );
        country.add ( "Afghanistan" );
        country.add ( "Italy" );
        country.add ( "United State Of America" );
        country.add ( "Canada" );
        System.out.println (country );

        System.out.println ("=====================================================================" );
        Iterator names= country.iterator ( );
           while(names.hasNext ()){
           System.out.print (names.next ()+" - " );
       }
    }
}