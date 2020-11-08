package com.syntax.class18;

public class Employee {
     /*
    Create a Class called Employee:
Create three  variables  empID , salary and set the CEO to “Sumair”
Create two objects of the class Employee
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects
     */

    int empID;
    double salary;
    static String CEO;


    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.empID = 123;
        employee1.salary = 100000;
        Employee.CEO = "Sumair";

        System.out.println(employee1.empID);
        System.out.println(employee1.salary);
        System.out.println(CEO);

        Employee employee2 = new Employee();
        employee2.empID = 12345;
        employee2.salary = 96000;

        System.out.println(employee2.empID);
        System.out.println(employee2.salary);
        System.out.println(CEO);

    }
}