package com.syntax.class18;

public class Student {
     /*
    Create a Class called Students
    Create three  variables  studentName , studentID  and  numberOfStudents
    Create three objects of the Students Class
    Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    Print out  total number of students
   */

    public String studentName;
    public int studentID;
    public  static int numberOfStudents;

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.studentName = "Moneer";
        student1.studentID = 123;
        Student.numberOfStudents++;

        System.out.println(student1.studentName);
        System.out.println(student1.studentID);
        System.out.println(Student.numberOfStudents);

        Student student2 = new Student();
        student2.studentName = "Davit";
        student2.studentID = 12345;
        Student.numberOfStudents++;

        System.out.println(student2.studentName);
        System.out.println(student2.studentID);
        System.out.println(Student.numberOfStudents);


        //Break till 8:55

    }

}
