package com.syntax.classReview11;

public class Constructors {

    int number;
    String justAnyMsg;
    Constructors(){
        System.out.println("Constructor without parameters");
    }
    Constructors(int number){
        this.number=number;
        System.out.println("Constructor with int type parameters");
    }
    Constructors(String justAnyMsg){
        this.justAnyMsg=justAnyMsg;
        System.out.println("Constructor with String parameters");
    }
    Constructors(int number,String justAnyMsg){
        this(number);
        this.justAnyMsg=justAnyMsg;
        System.out.println("Constructor with multiple  parameters");
    }

    public static void main(String[] args) {
        Constructors constructors=new Constructors();
        Constructors constructors1=new Constructors(123);
        Constructors constructors2=new Constructors("Hey there");

    }
}
