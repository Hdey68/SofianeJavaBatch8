package com.syntax.class31;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedHashSet;
public class HashsetDemo {

    public static void main(String[] args) {
        Set<String> hashSet=new HashSet<> ();
        Set<String> LinkedHashSet=new LinkedHashSet<>();
        Set<String> treeSet=new TreeSet<> ();
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Kiwi");
        hashSet.add("Apple");
        hashSet.add("strawberry");
        hashSet.add("avacado");
        hashSet.add("olives");

        System.out.println(hashSet);
    }
}
