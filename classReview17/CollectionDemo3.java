package com.syntax.classReview17;

import java.util.TreeSet;

public class CollectionDemo3 {

    public static void main(String[] args) {
        TreeSet<Person> treeSet=new TreeSet<>();

        treeSet.add(new Person("Kerim",20));
        treeSet.add(new Person("jack",25));
        treeSet.add(new Person("Eduard",22));
        treeSet.add(new Person("Ali",18));
        treeSet.add(new Person("Ilya",50));


        System.out.println(treeSet);
    }

}
