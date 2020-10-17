package com.syntax.class05;

import java.util.Scanner;

public class ClassHomeWork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("Please enter todays day using numbers only from 1 to 7");
		int today=input.nextInt();
		
		if(today==1 || today==2 || today==3 || today==4 ||today==5) {
			System.out.println("It s a weekday");
		}
		else if(today==6 || today==7) {
				System.out.println("It s a weekend");
			
			}else {
				System.out.println("Invalid day");
			}
		}
		
		
		
	

}
