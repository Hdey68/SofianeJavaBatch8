package com.syntax.class04;

public class IfElseself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * we need to compare 2 numbers:
		 * bigger, smaller or equal
		 */
         
		int num1=19;
		int num2=99;
		
		if(num1 > num2) {// what is this condition is true
			System.out.println(num1 + " is bigger than " + num2);
		} else if (num1 < num2) {// or what if this is true
			System.out.println(num1 + " is smaller than " + num2);
		} else {
			System.out.println(num1 + " is equal to " + num2);
		}

		System.out.println("--------------------------------------------------------");

		/*
		 * Based on the day of the week we will print class schedule
		 * 
		 */
		int day = 9;

		if (day == 1) {
			System.out.println("Today is Monday we have no class");
		} else if (day == 2) {
			System.out.println("Today is Tuesday we have Manual class");
		} else if (day == 3) {
			System.out.println("Today is Wednesday and we have Manual class again");
		} else if (day == 4) {
			System.out.println("Today is Thursday and we have Review class");
		} else if (day == 5) {
			System.out.println("Today is Friday but I clas tomorrow and I will prepare");
		} else if (day == 6) {
			System.out.println("Today is Saturday, I miss Java classes");
		} else if (day == 7) {
			System.out.println("Today is Sunday, I did a lot of coding");
		} else {
			System.out.println("This is invalid entry, please provide valid day from 1 to 7");
		}
	}
}
	


