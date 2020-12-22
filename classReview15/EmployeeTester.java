package com.syntax.classReview15;

public class EmployeeTester {
    public static void main (String[] args) {

        Employee1 fullTimeEmp=
                new FullTimeEmployee1(100000,20000,30000);
        Employee1 partTimeEmp=
                new PartTimeEmployee1(100000,20000,30000);
        Employee1 contractEmp=
                new ContractualEmployee1(100000,20000,30000);
        fullTimeEmp.getPaid();
        partTimeEmp.getPaid();
        contractEmp.getPaid();
        FullTimeEmployee1 fullTimeEmployee=
                new FullTimeEmployee1(100000,20000,30000);

        fullTimeEmployee.printInfo();
        fullTimeEmployee.getPaid();



    }
}
