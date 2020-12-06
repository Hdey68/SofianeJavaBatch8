package com.syntax.classReview06;

public class CalculatorTester {
    public static void main(String[] args) {
        Calculator calculator=new Calculator(15);
        calculator.add(10);
        calculator.printNumber();
        calculator.subtract(100);
        calculator.printNumber();
    }
}

