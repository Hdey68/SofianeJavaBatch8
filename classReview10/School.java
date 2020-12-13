package com.syntax.classReview10;

public class School {
    Student[] students=new Student[Student.MAX_STUDENTS_ALLOWED];
    int studentCounter=0;

    public void addStudent(Student student){
        if(studentCounter<Student.MAX_STUDENTS_ALLOWED){
            students[studentCounter]=student;
            studentCounter++;
            System.out.println(" Student "+student.name +" Admitted ");
        }else {
            System.out.println(" No more Room please join other Batch");
        }

    }

}
