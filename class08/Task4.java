package com.syntax.class08;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//*Write a program to ask a user to enter item they want to buy
// and the price of that item. Every time user enters money accumulate the amount 
// and tell the user how much is left to pay off.
// If user give more money program should return a change.
// Whenever a user done with payments program should say “Thank you for shopping!”
		
		Scanner input;
		String item;
		int cost;
		int money;
        
		input=new Scanner(System.in);
		System.out.println("What would you like to buy?");
		item=input.next();
		
		System.out.println("How much cost this item?");
		cost=input.nextInt();
		
		System.out.println("Please pay the amount");
		money=input.nextInt();
		
		while(money==cost) {
			System.out.println("Thank you for shopping!");
			break;
	    	} if(money<cost) {
				System.out.println("Please add more money");
                money=input.nextInt();
	           
				System.out.println("Thank you for shopping!");
		 
		}else if(money>cost) {
				System.out.println("Please take your change of $"+(money-cost));
				System.out.println("Thank you for shopping!");
			}
	}
}
	    

				
			
	
			

	
		
