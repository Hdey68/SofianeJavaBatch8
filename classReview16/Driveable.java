package com.syntax.classReview16;

public abstract class Driveable {
    boolean FAST_DRIVE=true;
    abstract void drive ( );
    void printInfo ( ){
        System.out.println("My Name is Danilo");
    }
    static  void printName(){
        System.out.println("My Name is Qasim");
    }
}


class  Car extends Driveable {

    @Override
    public void drive() {
        System.out.println("Now we can drive a car");
    }

}

class Bike extends Driveable {

    @Override
    public void drive() {
        System.out.println(" Now i can ride a bike");
    }
}

