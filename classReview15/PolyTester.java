package com.syntax.classReview15;

public class PolyTester {
    public static void main (String[] args) {


    Employee var1=new Secretary();
    LegalSecratary var2= new LegalSecratary();
    Employee var3=new Lawyer();
    Employee var4 =new LegalSecratary();
    Employee var5= new Employee();
    Object var6=new Secretary();

    // var3.method3();
    // var2.method2();
    // var3.method1();
    // var4.method1();
    // var5.method1();
    // var6.method1(); CE
    // var1.method1();
    //  var3.method2();
    //  var1.method3();
    // ((LegalSecratary)var6).method1(); // Exception because secretary and legal are different classes
    // ((Secretary)var3).method2();
    //  ((LegalSecratary)var4).method2();
    // ((Employee)var6).method3();
    // ((Secretary)var4).method3();

        ((Lawyer)var3).method2();
}
}
