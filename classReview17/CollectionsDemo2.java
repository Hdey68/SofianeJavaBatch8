package com.syntax.classReview17;

import java.util.ArrayList;

public class CollectionsDemo2 {


    public static void main (String[] args) {

        ArrayList<Person> personArrayList = new ArrayList<> ( );
        personArrayList.add ( new Person ( "Kerim", 20 ) );
        personArrayList.add ( new Person ( "jack", 25 ) );
        personArrayList.add ( new Person ( "Eduard", 22 ) );
        personArrayList.add ( new Person ( "Ali", 18 ) );
        personArrayList.add ( new Person ( "Ilya", 50 ) );
        System.out.println ( personArrayList.contains ( new Person ( "Ali", 18 ) ) );

        System.out.println ( personArrayList );

    }
}

