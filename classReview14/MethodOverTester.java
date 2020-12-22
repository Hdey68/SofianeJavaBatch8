package com.syntax.classReview14;

import java.util.ArrayList;

public class MethodOverTester {

    public static void main(String[] args) {
        MethodOverloading methodOverloading=
                new MethodOverloading();
        methodOverloading.addPrint(10,20);
        methodOverloading.addPrint("10",20);
        methodOverloading.addPrint(10,"20");
        methodOverloading.addPrint(10,20,30,40);
        methodOverloading.addPrint(10.0,20.0);
        methodOverloading.addPrint("10","20");
        methodOverloading.addPrint(new int[]{10,20});
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        methodOverloading.addPrint(arrayList);

    }
}
