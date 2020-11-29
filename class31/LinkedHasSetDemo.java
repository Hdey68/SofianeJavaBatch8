package com.syntax.class31;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashSet;

public class LinkedHasSetDemo {

    public static void main(String[] args) {
        Set<String> LinkedHashSet=new LinkedHashSet<>();
        LinkedHashSet.add("Apple");
        LinkedHashSet.add("Mango");
        LinkedHashSet.add("Kiwi");
        LinkedHashSet.add("Apple");
        LinkedHashSet.add("strawberry");
        LinkedHashSet.add("avacado");
        LinkedHashSet.add("olives");

        System.out.println(LinkedHashSet);
    }
}
