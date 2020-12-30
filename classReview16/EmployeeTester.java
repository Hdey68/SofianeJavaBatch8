package com.syntax.classReview16;

public class EmployeeTester {

    public static void main (String[] args) {
        BaseEmp permanentEmp = new PermanentEmp ( 100000 );
        System.out.println ( permanentEmp.getMonthlySalary ( ) );
        BaseEmp contractualEmp = new ContractEmp ( 240, 50 );
        System.out.println ( contractualEmp.getMonthlySalary ( ) );
    }
}
