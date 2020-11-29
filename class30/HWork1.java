package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class HWork1 {
    /*
    Create an arraylist of cars and retrieve all the values using 3 different ways.

     */
    public static void main (String[] args) {

        ArrayList<String> listCars = new ArrayList<String> ( );
        listCars.add ( "Renault" );
        listCars.add ( "Peugeot" );
        listCars.add ( "Citroen" );
        listCars.add ( "Fiat" );
        listCars.add ( "Alfa Romeo" );
        System.out.println ( listCars );
        System.out.println ( "*************************************************************************" );

        System.out.println ( "--Using for loop" );
        for (String car : listCars) {
            System.out.print ( car + ", " );
        }
        System.out.println ( );
        System.out.println ( "******************************************************************************" );

        System.out.println ("--Using iterator" );
        Iterator<String> iterator = listCars.iterator ( );
        while (iterator.hasNext ( )) {
            String next = iterator.next ( );
            System.out.print (next+", " );
        }
    }
}




