package com.syntax.classReview14;

public class OverloadingConsDemoTester {

    public static void main(String[] args) {
        ConstOverlDemo constOverlDemo1=
                new ConstOverlDemo();

        ConstOverlDemo constOverlDemo2=
                new ConstOverlDemo("Amanullah");
        constOverlDemo2.printInfo();

        ConstOverlDemo constOverlDemo3=
                new ConstOverlDemo("Amanullah","Khan");

        constOverlDemo3.printInfo();

        ConstOverlDemo constOverlDemo4=
                new ConstOverlDemo("Amanullah","Khan",45);
        constOverlDemo4.printInfo();
    }
}

