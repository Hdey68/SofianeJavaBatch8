package com.syntax.class04;

import java.util.Scanner;

public class HomeWork3Class4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		Scanner myInput=new Scanner(System.in);
		
		System.out.println("Which city are you in?");
		String city=myInput.next();
		
		System.out.println("What is the temperature in your city?");
		int temp=myInput.nextInt();
		
		temp= ((temp-32)*5)/9;
		System.out.println("The temperature in the "+city+" is "+temp);
		
		
		
		
		
	    
		
		
		
		
		
		
		

	}

}
