package com.syntax.class19;

public class StudentTester {

    public static void main(String[] args) {
        Student student1 = new Student("Marta", 93, 90, 91);
        student1.printGradeAverage();
        Student student2 = new Student("Jack", 87, 80, 97);
        student2.printGradeAverage();
        Student student3 = new Student("Danilo", 100, 100, 100);
        student3.printGradeAverage();
        Student student4 = new Student("Maria", 98, 94, 96);
        student4.printGradeAverage();
        Student student5 = new Student("Nabin", 100, 100, 92);
        student5.printGradeAverage();
    }
}
