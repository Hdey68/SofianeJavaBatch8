package com.syntax.class30;

import java.util.ArrayList;

public class HWork2 {
    /*
    Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
     */
    public static void main (String[] args) {
        ArrayList<String> drinks = new ArrayList<String> ( );
        drinks.add ( "Fuji" );
        drinks.add ( "Evian" );
        drinks.add ( "Perrier" );
        drinks.add ( "Himalaya" );
        drinks.add ( "Jenna" );

        for (int i = 0; i < drinks.size ( ); i++) {
            if (drinks.get ( i ).contains ( "a" ) || drinks.get ( i ).contains ( "e" )) {
                drinks.set ( i, "water" );
            }
        }
                System.out.println ( drinks)  ;
            }

    }
