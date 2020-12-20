package com.syntax.class36;

public class PersonInfo {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public PersonInfo(){

    }

    public PersonInfo (String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName ( ) {
        return firstName;
    }

    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }

    public String getLastName ( ) {
        return lastName;
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public int getAge ( ) {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public double getSalary ( ) {
        return salary;
    }

    public void setSalary (double salary) {
        this.salary = salary;
    }

    @Override
    public String toString ( ) {
        return "PersonInfo{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
