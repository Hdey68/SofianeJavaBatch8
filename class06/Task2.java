package com.syntax.class06;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan;
		char grade;
		String message;

		scan = new Scanner(System.in);
		System.out.println("Enter your grade");
		grade = scan.next().charAt(0);
		
		switch (grade) {
		case 'A':
			message = "Excellent ";
			break;
		case 'B':
			message = "Good";
			break;
		case 'C':
			message = "Average";
			break;
		case 'D':
			message = "Bad";
			break;
		default:
			message = "Not Acceptable";
		}
		
		System.out.println(message);

	}

}
	


