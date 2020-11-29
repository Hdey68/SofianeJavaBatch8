package com.syntax.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    /*
    Create an arrayList of even numbers from 1 to 50.
    Remove any number that is divisible by 5 from that arrayList.
     */
    public static void main (String[] args) {
        ArrayList<Integer> integers=new ArrayList<> (  );
        integers.add ( 2 );
        integers.add ( 10 );
        integers.add ( 22);
        integers.add ( 36 );
        integers.add ( 44);
        integers.add ( 50);
        System.out.println ("Before removal" );
        System.out.println (integers );
        Iterator<Integer> iterator=integers.iterator ();
        while (iterator.hasNext ()){
            if(iterator.next ()%5==0){
                iterator.remove ();
            }
        }
        System.out.println ("After removal" );
        System.out.println (integers );
    }
}
