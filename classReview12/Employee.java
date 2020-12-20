package com.syntax.classReview12;

public class Employee {

    String firstname;
    String lastName;
    double bonus;
    Employee(){

    }
    Employee(String firstname,String lastName,double salary){
        this.firstname=firstname;
        this.lastName=lastName;
        if(salary>150000){
            bonus=.5;
        }else {
            bonus=0.3;
        }
        System.out.println("Constructor called from the Parent Employee class");
    }

    public void displayInfo(){
        System.out.print(firstname+" "+lastName);
    }

}

class Tester extends Employee{

    String team;
    double salary;
    Tester(String firstname,String lastName,String team,double salary){
        super(firstname,lastName,salary);
        this.salary=salary;
        this.team=team;
        System.out.println("Constructor called from the Child Tester class");


    }

    public void displayInfo(){

        super.displayInfo();
        System.out.println(" works in "+team+ " bonus Plus salary "+(salary*bonus+salary));
    }

}

