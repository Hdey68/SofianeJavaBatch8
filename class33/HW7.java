package com.syntax.class33;

import java.util.LinkedHashSet;
import java.util.Set;

public class HW7 {
    /*
    Create the collection that will store single uniques Objects of a String type in which order is preserved.
    Write a logic to concatenate all string from the collection.
     */
    public static void main(String[] args) {
        Set<String> string = new LinkedHashSet<> ( );
        string.add ( "I " );
        string.add ( "always " );
        string.add ( "loved" );
        string.add ( "to" );
        string.add ( "flight" );
        string.addAll ( string );
        System.out.println ( string);

    }
}//////////////////////////////////////////////////////////////////done///////////////////////////////////////////

