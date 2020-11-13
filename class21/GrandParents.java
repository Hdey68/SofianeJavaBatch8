package com.syntax.class21;

public class GrandParents {
    int money;
    GrandParents(){
        System.out.println("Constructor from GrandParents");

    }
    GrandParents(int money){
        this.money=money;
        System.out.println("Constructor from GrandParents to init money");

    }

    void print(){
        System.out.println("i have this money "+money);
    }
}
