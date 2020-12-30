package com.syntax.classReview16;

import java.util.ArrayList;
import java.util.List;

public class LambdaDemo {

    public static void main(String[] args) {

        List<String> list=new ArrayList<> ();
        list.add("Ali");
        list.add("Eduard");
        list.add("Burju");
        list.add("Qasim");
        list.add("Moneer");

        for (String name:list
        ) {
            if(name.startsWith("A")){
                System.out.println(name);
            }
        }

        list.stream().filter(f -> f.startsWith("A")).forEach(System.out::println);
    }
}
