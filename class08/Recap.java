package com.syntax.class08;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//*ask user to pay for water
		//water price is 5
		//once user enters money then we need to tell if we need more or less
		//once user gives us exact 5 then--->enjoy your water
		
		/* ask user to pay for a water
		 * water price is 5
		 * once user enters money then we need to tell if we need more money or less
		 * once user gives us exact 5 then --> enjoy your water!
		 */
		
		Scanner input;
		int money;
		int waterPrice=5;
		
		input=new Scanner(System.in);
		System.out.println("Please pay for your water!");
		money=input.nextInt();
		
		while(money!=waterPrice) {
			if (money>waterPrice) {
				System.out.println("This is too much, you need to enter less money");
				//money =input.nextInt();
			}else {
				System.out.println("Water is expensive, please insert more money");
				//money=input.nextInt();
			}
			
			money=input.nextInt();
		}

		System.out.println("Enjoy your water");
	}
}