package com.syntax.classReview07;

public class LocalVarDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            // System.out.println(a);
            // System.out.println(i); CE can't resolve symbol because it is outside
            // block of code
            {
                //local variable limited to this block only
                int a=10;
            }
            // System.out.println(a);
            // System.out.println(i); CE can't resolve symbol because it is outside
            // block of code
        }
        // System.out.println(i); CE can't resolve symbol because it is outside
        // block of code

        print();
    }
    public static void print(){
        int a=0; //local variable
        System.out.println(a);
    }
}

