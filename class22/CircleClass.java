package com.syntax.class22;

public class CircleClass extends ShapeClass {
    /*
  Write program: Shape class has a constructor
  that takes the radius and has a subclass as  circle class.
  In circle class create a method to calculate the area of circle.
  Test your code
   */
    CircleClass(double radius) {
        super(radius);
    }

    public void calculateArea(){
        double area=3.14*radius*radius;
        System.out.println(area);
    }

    public static void main(String[] args) {

        CircleClass task2 = new CircleClass(2);
        task2.calculateArea();
    }
}
