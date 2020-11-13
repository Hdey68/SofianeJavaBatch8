package com.syntax.class20;

public class Task3Tester {
    public static void main(String[] args) {
       /* Task3 task1=new Task3("Marta");
        System.out.println(task1.name);   //CE because the constructor is private
        System.out.println(task1.age);
        System.out.println(task1.salary);*/

        Task3 task2=new Task3(12);
        System.out.println(task2.name);
        System.out.println(task2.age);
        System.out.println(task2.salary);

        Task3 task3=new Task3(1000.00);
        System.out.println(task3.name);
        System.out.println(task3.age);
        System.out.println(task3.salary);
    }
}
