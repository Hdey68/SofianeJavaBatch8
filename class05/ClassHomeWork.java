package com.syntax.class05;

import java.util.Scanner;

public class ClassHomeWork {

	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		System.out.println("Enter numbers of worked years:");
		
		int workYears=input.nextInt();
		
		if(workYears>=5) {
			System.out.println("What is your annual salary:");
			int annualSalary=input.nextInt();	
			System.out.println("User is eligible for the bonus");
			if(annualSalary>50000) {
				System.out.println("your Bonus is 5000");
			}else {
				System.out.println("Your bonus is 3000");
			}	
	}else {
		System.out.println("You are not eligible");
			}
		}
		
	}


