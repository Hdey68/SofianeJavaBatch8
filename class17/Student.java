package com.syntax.class17;

public class   Student {
    String name;
    int age;
    double marks;
    static int numberOfStudentsEnrolled;

    public void printInfo() {
        int number=12;
        System.out.println("Name " + name + " Age " + age + " Marks " + marks);
    }

    public void printMarks() {

        System.out.println(" Marks " + marks);
    }

    public void StudentsRegistered() {
        System.out.println("Total number of student up till now " + numberOfStudentsEnrolled);
    }

    public static void main(String[] args) {
        Student qasim = new Student();
        qasim.name = "Qasim";
        qasim.age = 30;
         qasim.marks = 90;

         qasim.StudentsRegistered();
        qasim.numberOfStudentsEnrolled++;


         Student danilo = new Student();

        danilo.name = "Danilo";
        danilo.age = 30;
         danilo.marks = 95;
        danilo.numberOfStudentsEnrolled++;
         danilo.StudentsRegistered();

        Student ilya = new Student();
        ilya.name = "Ilya";
         ilya.age = 40;
        ilya.marks = 98;
        ilya.numberOfStudentsEnrolled++;
        ilya.StudentsRegistered();

    }
}

