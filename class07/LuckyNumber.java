package com.syntax.class07;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//play a lottery where we need to enter from 1 to 100
		//lucky number is 7
		//keep asking a user to enter a number until entered number is same as lucky number
	
	
	Scanner scan;
	int numberFromUser;
	int luckyNumber=7;
	scan=new Scanner(System.in);
	
	do {
		System.out.println("Please enter any number from range 1 to 100");
		numberFromUser=scan.nextInt();
	}while(numberFromUser!=luckyNumber);
	System.out.println("You guessed the number right");
	
	
	}
	}


