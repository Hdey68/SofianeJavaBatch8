package com.syntax.classReview17;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class CollectionsDemo {

    public static void main (String[] args) {


    /*
    Can strore one value at a time
     */
    String name="Mahmut";
    String name1="Danilo";
    /*
    Arrays can store multiple objects

     */
    String[] names=new String[5];
    names[0]="Mahmut";
    names[1]="Danilo";
    /*
    Collections frame
     */
        ArrayList<String> arrayList=new ArrayList<> ( );
        arrayList.add ( "Ali" );
        arrayList.add("Christina");
        System.out.println (arrayList.get ( 0 ).length () );
        System.out.println (arrayList.get ( 1 ).length () );


        LinkedList<String> linkedList=new LinkedList<> (  );
        linkedList.add ("Christina" );
        linkedList.add ( "Ali" );


        System.out.println (linkedList.get ( 0 ).length () );
        System.out.println (linkedList.get ( 1 ).length () );



    }

}
