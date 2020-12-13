package com.syntax.classReview08;

public class Calculator {
    int num;
    static int num2=100;

    Calculator(int num) {
        this.num = num;
        num2=num;
    }
    static void  printStaticInfo(){
        System.out.println("num2 "+ num2);
        //CE because instance fields belong to objects and static fields or methods
        //they belong to class we will have a conflict.
        // System.out.println("num2 "+ num);

    }
    void printInfo(){
        System.out.println("num2 "+ num2);
        System.out.println("num2 "+ num);
    }
    int add(int num) {
        return this.num=this.num + num;
    }
    int subtract(int num) {
        return this.num=this.num - num;
    }
    void printNumber(){
        System.out.println("Results "+num);
    }
}

