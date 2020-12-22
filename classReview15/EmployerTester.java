package com.syntax.classReview15;

public class EmployerTester {

}
class Employee{

    public void method1(){
        System.out.println(" Employee 1");
        method3();
    }
    public void method3(){
        System.out.println(" Employee 3");
    }
}
class Secretary extends Employee {
    public void method3(){
        System.out.println("Secretary 3");
        super.method3();
    }
}
class Lawyer extends Employee {
    public void method2(){
        System.out.println("Lawyer2");
    }
    public  void method3(){
        System.out.println("Lawyer3");
    }
}
class LegalSecratary extends Secretary{
    public void method2(){
        System.out.println("Legal secratary 2");
    }
    public  void method3(){
        System.out.println("LegalSecratary 3");
    }

}
