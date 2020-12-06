package com.syntax.class32;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DifferenceBetweenListAndSet {

    public static void main (String[] args) {
        HashSet<String> hashSet=new HashSet<> (  );
        hashSet.add ( "Apple" );
        hashSet.add("Mango");
        hashSet.add("Kiwi");
        hashSet.add("Apple");
        hashSet.add("strawberry");
        hashSet.add("avocado");
        hashSet.add("olives");
        for(String element:hashSet){
            System.out.println (element );
        }
        List<String> arrayList=new ArrayList<> (  );
        arrayList.add ( "Apple" );
        arrayList.add("Mango");
        arrayList.add("Kiwi");
        arrayList.add("Apple");
        arrayList.add("strawberry");
        arrayList.add("avocado");
        arrayList.add("olives");
        System.out.println (arrayList.get ( 3 ) );
    }
}
