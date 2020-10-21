package com.syntax.class08;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
    //  Write a program that reads a range of integers (start and end point), provided by a user ,
	//  then from that range prints the sum of the even and odd integers.
		
		Scanner input;
		int startingPoint;
		int endingPoint;
		int sumEven=0;
		int sumOdd=0;
		input=new Scanner(System.in);
		
		System.out.println("Enter starting point:");
		startingPoint=input.nextInt();
		
		System.out.println("Enter ending point:");
		endingPoint=input.nextInt();
		
		for(int i=startingPoint; i<=endingPoint; i++) {
			
			if(i%2==0) {
				sumEven+=i;
			}
			if(i%2!=0) {
				sumOdd+=i;
			}
		}
				System.out.println("The sum of the even integers = "+sumEven);
			
			
			System.out.println("The sum of the even integers = "+sumOdd);
		}
		
	}

	

