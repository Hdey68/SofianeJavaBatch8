package com.syntax.classReview07;

class Student2 {
    static int totalStudentCount;
    static final String schoolName = "Syntax";
    String name;
    final static int MAX_STUDENTS_ALLOWED = 3;
    private static Student2 student = null;

    private Student2() {
        totalStudentCount++;
    }

    static Student2 getInstance() {
        if (student == null) {
            student = new Student2();
        }
        return student;

    }

    void printInfo() {
        System.out.println("Name of the student "
                + name + " Name of the school "
                + schoolName + " Total Students registered " + totalStudentCount);
    }
}

public class StaticVarDemo2 {
    public static void main(String[] args) {


        Student2 student5 = Student2.getInstance();
        student5.name = "Mahmut";
        student5.printInfo();

        Student2 student6 = Student2.getInstance();
        student6.name = "Davit";
        student6.printInfo();
        System.out.println(student5.name);
        System.out.println(student6.name);


    }
}


