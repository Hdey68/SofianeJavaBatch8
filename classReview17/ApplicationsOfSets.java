package com.syntax.classReview17;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class ApplicationsOfSets {
    public static void main (String[] args) {

        //why and when we should be using the sets
        Scanner scanner=new Scanner ( System.in );
        ArrayList<String> arrayList=new ArrayList<> (  );
        TreeSet<String> treeSet=new TreeSet<> (  );

        for (int i=0;i<5;i++){
            arrayList.add ( scanner.next ( ) );
        }
        arrayList.addAll ( treeSet );
        System.out.println (arrayList );
    }
}
