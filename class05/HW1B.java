package com.syntax.class05;

import java.util.Scanner;

public class HW1B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1  Write a program to find largest number among three numbers using
				//   nested if provided by a user (numbers must be distinct)
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please provide 3 distinct numbers");
		int num1=input.nextInt();
		int num2=input.nextInt();
		int num3=input.nextInt();
		int largest;
		
		if(num1>=num2) {
		 if(num1>num3) {
			largest=num1;
		 }else {
			 largest=num3;
		 }
		}else {
			if(num2>=num3) {
				largest=num2;
			}else {
				largest=num3;
				
			}
		 }
		System.out.println("The largest number is "+largest);	
		}
		}
		
		
		
		
		
	
	



