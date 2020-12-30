package com.syntax.classReview16;

public abstract class Shape {

    public abstract double area();
}

class Circle extends Shape{

    @Override
    public double area() {
        return Math.PI*3*3;
    }
}

class Rectangle extends Shape{

    @Override
    public double area() {
        return 3*4;
    }
}
