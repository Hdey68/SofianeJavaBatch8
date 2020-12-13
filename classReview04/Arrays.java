package com.syntax.classReview04;

public class Arrays {

    public static void main(String[] args) {
        String name1="Asghar nazir";
        String name2="Asghar nazir";
        String name3="Asghar nazir";
        String name4="Asghar nazir";
        String name5="Asghar nazir";
        String name6="Asghar nazir";
        //if i want all the names of this class how many vars
        String[] name={"asghar nazir","syntax"};
        for (int i = 0; i < 2; i++) {
            System.out.println(name[i]);
        }
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
    }
}
