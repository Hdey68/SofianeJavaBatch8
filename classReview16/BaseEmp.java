package com.syntax.classReview16;

public abstract class BaseEmp {
    public abstract double getMonthlySalary();
}
class PermanentEmp extends BaseEmp{

    double annualSalary;
    PermanentEmp(double annualSalary){
        this.annualSalary=annualSalary;
    }

    @Override
    public double getMonthlySalary() {
        return annualSalary/12;
    }
}
class ContractEmp extends BaseEmp{
    double noOfHours, hourlyRate;

    public ContractEmp(double noOfHours, double hourlyRate) {
        this.noOfHours = noOfHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getMonthlySalary() {
        return hourlyRate*noOfHours;
    }
}

