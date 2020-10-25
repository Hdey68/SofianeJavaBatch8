package com.syntax.class10;

import java.util.Scanner;

public class Task3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an array on double using scanner 
		// and calculate the sum of all elements that was stored in an array.
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter three numbers");
		double num1=input.nextDouble();
		double num2=input.nextDouble();
		double num3=input.nextDouble();
		
		double sumNum=0;
		
		double[] num= {num1,num2,num3};
		
		for(int i=0; i<num.length; i++) {
			sumNum+=num [i];
		}
		System.out.println(sumNum);
			
	}

}
