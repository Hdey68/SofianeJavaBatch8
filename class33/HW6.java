package com.syntax.class33;

import java.util.HashMap;
import java.util.Map;

public class HW6 {
    /*
    Create a Map that will store Employee name and salary.
    Write a logic to retrieve an employee who gets the highest salary.
    Output should be in the below format
    John Smith=$100000
     */
    public static void main (String[] args) {
        Map<String,Integer> employee=new HashMap<> (  );
        employee.put ("Demi Moore",99000  );
        employee.put ("John Smith",100000  );
        employee.put ("Jennifer Lopez",85000  );
        employee.put ("Antony Queen",98000  );

        Map.Entry<String, Integer> salary=null;

        for( Map.Entry<String,Integer>maxSalary:employee.entrySet()){
            if (salary == null || maxSalary.getValue().compareTo(salary.getValue()) > 0){
                salary = maxSalary;
            }
        }
        System.out.println(salary);
    }
}////////////////////////////////////////////////////done///////////////////////////////////////////////////
