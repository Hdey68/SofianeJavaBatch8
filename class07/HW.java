package com.syntax.class07;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter two numbers");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		System.out.println("Please enter the Math operations +, -, *, / ");
		char operation = input.next().charAt(0);

		double result = 0;

		switch (operation) {
		case '+':
			result = (num1 + num2);
			break;
		case '-':
			result = (num1 - num2);
			break;
		case '*':
			result = (num1 * num2);
			break;
		case '/':
			result = (num1 / num2);
			break;
		default:
			System.out.println("Error");
		}

		if (result != 0) {
			System.out.println("The Result is = " + result);
		}

	}
}
	


