package com.syntax.class30;
import java.util.ArrayList;
public class Task1 {
    /*
    Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that
     */
    public static void main (String[] args) {

        ArrayList<String> namesArray = new ArrayList<> ( );
        namesArray.add ( "sofiane" );
        namesArray.add ( "adel" );
        namesArray.add ( "mounir" );
        namesArray.add ( "ali" );
        namesArray.add ( "kamel" );
        System.out.println ( namesArray.isEmpty ( ) );
        System.out.println ( namesArray.contains ( "kamel" ) );
        System.out.println ( namesArray.size ( ) );
        System.out.println ( namesArray );
    }
}




