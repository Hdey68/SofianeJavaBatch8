package com.syntax.class06;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
        boolean sale;
        double price;
        double discount;
        double finalPrice;
        
        Scanner input=new Scanner(System.in);
        System.out.println("Please tell me if you have sale today");
        
        sale=input.nextBoolean();
        
        
        
        if(!sale) {
        	System.out.println("No shopping !!");
        		
        }else {
        	System.out.println("Please enter the price");
        	price=input.nextDouble();
        	
        	if(price>=10 && price<50) {
        		discount=price*0.1;
        	}else if(price>=50 && price<100) {
        		discount=price*0.2;
        	}else if(price>=100 && price<500) {
        		discount=price*0.4;
        	}else if(price>=500) {
        		discount=price*0.5;
        	}else {
        		discount=0;
        	}
        	finalPrice=price-discount;	
        	
        		System.out.println("You product price is $"+price+" and your get $"+discount+" discount."+" and you pay only $"+finalPrice);
        	}
        	
        System.out.println("-----------------------------------------------------");

		if (sale) {
			System.out.println("Please enter the price");
			price = input.nextDouble();

			if (price >= 10 && price < 50) {
				discount = price * 0.1;
			} else if (price >= 50 && price < 100) {
				discount = price * 0.2;
			} else if (price >= 100 && price < 500) {
				discount = price * 0.4;
			} else if (price >= 500) {
				discount = price * 0.5;
			} else {
				discount = 0;
			}

			finalPrice = price - discount;
			System.out.println("Your product price is $" + price + " and you get $" + discount + " discount."
					+ " and you pay only " + finalPrice);

		} else {
			System.out.println("No shopping!! ");
		}
	}
}
        


	
	


