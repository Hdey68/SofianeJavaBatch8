package com.syntax.classReview08;

public class CalculatorTester {


    public static void main(String[] args) {
        Calculator calculator=new Calculator(15);
        calculator.add(10);
        calculator.printNumber();
        calculator.subtract(100);
        calculator.printNumber();

        Calculator calculator1=new Calculator(150);
        calculator1.add(100);
        calculator1.printNumber();
        calculator1.subtract(1000);
        calculator1.printNumber();
        Calculator.printStaticInfo();

    }
}

