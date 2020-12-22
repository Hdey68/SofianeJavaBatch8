package com.syntax.classReview15;

public class FinalKeyword {
    public static final double PI = 3.14;

    public final void printPi() {
        System.out.println(PI);
    }
}

/*class FinalChild extends FinalKeyword{
    //CE error as the class is final
}*/

class FinalKeyword2 {
    public static final double PI = 3.14;
    public final void printPi() {
        System.out.println(PI);
    }
}
class  FinalChild2 extends FinalKeyword2{
    public void printPi(int num){
        //because method signature is different we are not overriding
        //we are just creating a new method in our child class as signatures don't match
    }

    //public void printPi(){} can not override as method is final
}
