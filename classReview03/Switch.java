package com.syntax.classReview03;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        char operation;
        int num1;
        int num2;
        int results;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter two numbers");
        num1=scanner.nextInt();
        num2=scanner.nextInt();
        System.out.println("Please Enter operation + - / *");
        operation=scanner.next().charAt(0);

        if(operation=='+'){
            results=num1+num2;
        }else if(operation=='-'){
            results=num1-num2;
        }else if(operation=='/'){
            results=num1/num2;
        }else if(operation=='*'){
            results=num1*num2;
        }else {
            results=0;
        }
        System.out.println("Results are "+ results);


        switch (operation) {
            case '+':
                results = num1 + num2;
                break;
            case '-':
                results = num1 - num2;
                break;
            case '/':
                results = num1 / num2;
                break;
            case '*':
                results = num1 * num2;
                break;
            default:
                results = 0;
                break;
        }
       /*
       when to use switch always use if possible because switch is fast
       more cleaner and readable why fast because in switch we use a special
       data type at the backend called lookup table or hash list we do not
       go line by line in the case of switch we directly jump to that condition
        */
        //when we can not use
        int marks=100;
        if(num1>90 && num1<=100){
            System.out.println("A");
        }else if(num1>70&&num1<=90){
            System.out.println("B");
        }else if(num1>50&&num1<=70){
            System.out.println("C");
        }
    }
}

