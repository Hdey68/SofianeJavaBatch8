package com.syntax.class33;

import java.util.*;

public class HW2 {
    /*
    Create a map of countries with its capital that will store countries in alphabetical order.
    Print all keys and values from a country map using for each loop and iterator.
    Print all values from a country map using for each loop and iterator.
     */
    public static void main (String[] args) {
        Map<String, String> country = new TreeMap<> ( );
        country.put ( "Algeria", "Algiers" );
        country.put ( "Spain", "Madrid" );
        country.put ( "Morocco", "Rabat" );
        country.put ( "France", "Paris" );
        country.put ( "Saudia Arabia", "Riad" );

        Set<String> keys = country.keySet ( );
        for (String key : keys) {
            System.out.println ( key + ": " + country.get ( key ) );

        }
        System.out.println ( "---------------------------------------------" );
        Iterator<String> itKey = keys.iterator ( );
        while (itKey.hasNext ( )) {
            String key = itKey.next ( );
            System.out.println ( key + ": " + country.get ( key ) );
        }
        System.out.println ( "------------------------------------------------" );
        Collection<String> values = country.values ( );
        for (String value : values) {
            System.out.println ( value );
        }
        System.out.println ( "----------------------------------------------------" );
        Iterator<String> itValue = values.iterator();
        while(itValue.hasNext()) {
            String value = itValue.next();
            System.out.println(value);
    }
}}///////////////////////////////////////////////done/////////////////////////////////////////////////////////////