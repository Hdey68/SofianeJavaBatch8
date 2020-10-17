package com.syntax.class05;

import java.util.Scanner;

public class HW1A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1  Write a program to find largest of three double values using if-else..
		//  if and logical operators provided by a user (numbers must be distinct)
		
        //1  Write a program to find largest number among three numbers using
		//   nested if provided by a user (numbers must be distinct)


		  Scanner input=new Scanner(System.in);
		  System.out.println("Please type 3 distinct numbers");
		  
		  double num1=input.nextDouble();
		  double num2=input.nextDouble();
		  double num3=input.nextDouble();
		  double largest;
		  
		  if(num1>num2 && num1>num3) {
			  largest=num1;
		  
		  
		  }else if(num2>num3) {
			  largest=num2;
		   }else {
			  largest=num3;
		   }
			  System.out.println("The largest number is " + largest);
			  
			  
			  
		  }
		   }
		  
	
	
		  
		  
		
		
	

