package com.syntax.classReview17;

import java.util.ArrayList;
import java.util.HashMap;

public class MapsDemo {

    public static void main (String[] args) {

        ArrayList<Person> arrayList=new ArrayList<>();
        arrayList.add(new Person("Ali",26));
        arrayList.add(new Person("Mike",25));
        arrayList.add(new Person("Sabeen",18));
        arrayList.add(new Person("Artem",30));


        HashMap<String,Person> hashSet=new HashMap();
        hashSet.put("Ali",new Person("Ali",26));
        hashSet.put("Mike",new Person("Mike",25));
        hashSet.put("Sabeen",new Person("Sabeen",18));
        hashSet.put("Artem",new Person("Artem",30));

        System.out.println(hashSet);
        System.out.println(hashSet.get("Sabeen"));



    }
    }

