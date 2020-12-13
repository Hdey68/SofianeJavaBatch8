package com.syntax.classReview04;

import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {
        char operation;
        int num1;
        int num2;
        int results;
        String end;
        boolean continueLoop = false;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please Enter two numbers");
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
            System.out.println("Please Enter operation + - / *");
            operation = scanner.next().charAt(0);

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

            System.out.println("Results are "+results);
            System.out.println("Enter yes to perform more operations or no to terminate the program");
            end = scanner.next();
            if ("no".equals(end)) {
                continueLoop = false;
            }else {
                continueLoop = true;
            }
        } while ( continueLoop);
    }
}
