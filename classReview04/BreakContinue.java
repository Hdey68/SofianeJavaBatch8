package com.syntax.classReview04;

import java.util.Scanner;

public class BreakContinue {

    public static void main(String[] args) {
        char operation;
        int num1;
        int num2;
        int results;
        String end;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please Enter two numbers");
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
            System.out.println("Please Enter operation + - / *");
            operation = scanner.next().charAt(0);

            if (!(operation == '+' || operation == '-' || operation == '*' || operation == '/')) {
                System.out.println("Operation not supported");
                continue;
            }
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

            System.out.println("Results are " + results);
            System.out.println("Enter yes to perform more operations or no to terminate the program");
            end = scanner.next();
            if ("no".equals(end)) {
                break;
            }
        }
    }
}
