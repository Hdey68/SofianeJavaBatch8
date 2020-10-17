package com.syntax.class05;

import java.util.Scanner;

public class HM2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//**You are working in sales and have to calculate commission for the employees;

			//  You need to ask user a sales amount and based on the amount you need to define their commission

			//	if user sold products for more than $10 but less than 100 --> commission is 10%

			//	if sales is more than 100 but less then 200 --> commission is 20%

			//	if sales is more than 200 but less then 500 --> commission is 30%

			//	if sales is more than 500 --> commission is 50%

			//	You program should print How much in commission user will get
		
		
		    Scanner input=new Scanner(System.in);
		    System.out.println("How much was the sales amount?");
		    
		   double salesAmount=input.nextDouble();
		   double commission;
		   
		   if(salesAmount>=10 && salesAmount<100) {
			   commission=(salesAmount*10)/100;
		    
		   }else if(salesAmount>=100 && salesAmount<200) {
			   commission=(salesAmount*20)/100;
		     
		   }else if(salesAmount>=200 && salesAmount<500) {
			   commission=(salesAmount*30)/100;
		     
		   }else if(salesAmount>=500) {
		      commission=(salesAmount*50)/100;
			   
		   }else {
			   commission=0;
		   }
			   System.out.println("You will get $"+commission+" in commission");
			   
			   
			   
			   
			   
			   
			   
			   
		   }
		
		
		
		
		
		
		
	}


