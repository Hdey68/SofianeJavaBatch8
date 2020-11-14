package com.syntax.class23;

public class PrevClassTask1 {
    /*
   Create a class named 'PrevClassTask1'.
   While creating an object of the class,
   if nothing is passed to it, then the message
   "I love programming languages" should be printed.
   If some String is passed to it, then in place of "programming languages"
   the value variable should be printed. Example, if we pass "Java", then "I
   love Java" should be printed.
    */
    public PrevClassTask1() {
        System.out.println("I love programming languages");
    }

    public PrevClassTask1(String var) {
        System.out.println("I love " + var);
    }

    public static void main(String[] args) {
        PrevClassTask1 prevClassTask1=new PrevClassTask1();
        PrevClassTask1 prevClassTask2=new PrevClassTask1("Java");
        PrevClassTask1 prevClassTask3=new PrevClassTask1("rabbits");
    }

}
