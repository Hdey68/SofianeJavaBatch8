package com.syntax.classReview15;

public abstract class Employee1 {
    double salary;
    double bonus;
    double medicalAllowance;

    public Employee1(double salary, double bonus, double medicalAllowance) {
        this.salary = salary;
        this.bonus = bonus;
        this.medicalAllowance = medicalAllowance;
    }

    public abstract void getPaid();
}

class FullTimeEmployee1 extends Employee1
{


    public FullTimeEmployee1(double salary, double bonus, double medicalAllowance) {
        super(salary, bonus, medicalAllowance);
    }

    public void printInfo(){
        System.out.println(" I am full time employee i enjoy all the benefits and i also have annul leaves ");
    }

    @Override
    public void getPaid() {
        System.out.println("Salary "+(salary+bonus+medicalAllowance));
    }
}
class PartTimeEmployee1 extends Employee1 {

    public PartTimeEmployee1(double salary, double bonus, double medicalAllowance) {
        super(salary, bonus, medicalAllowance);
    }
    public void vacation(){
        System.out.println(" i don't go on  vacations");
    }

    @Override
    public void getPaid() {
        System.out.println("Salary "+(salary));

    }
}

class ContractualEmployee1 extends Employee1 {

    public ContractualEmployee1(double salary, double bonus, double medicalAllowance) {
        super(salary, bonus, medicalAllowance);
    }

    public void printContract(){
        System.out.println(" i have a contract");
    }
    @Override
    public void getPaid() {
        System.out.println("Salary "+(salary+bonus));

    }
    }
