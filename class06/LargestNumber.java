package com.syntax.class06;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double num1, num2, num3, max;

		num1 = scanner.nextDouble();
		num2 = scanner.nextDouble();
		num3 = scanner.nextDouble();
		scanner.close();
		// 1st way
		System.out.println("------------------------ PLACING COMPARISONG IN IF PART--------------------------------------");
		if (!(num1 == num2 && num2 == num3)) {

			if (num1 > num2 && num1 > num3) {
				max = num1;
			} else if (num2 > num3) {
				max = num2;
			} else {
				max = num3;
			}
			System.out.println(max);

		} else {
			System.out.println("Number are equal");
			System.out.println("Largest value is " + num1);
		}

		System.out.println("------------------------ PLACING COMPARISONG IN ELSE PART--------------------------------------");

		if (num1 == num2 && num2 == num3) {
			System.out.println("Number are equal");
		
		} else {
			
			if (num1 > num2 && num1 > num3) {
				max = num1;
			} else if (num2 > num3) {
				max = num2;
			} else {
				max = num3;
			}
			System.out.println(max);

		}
		
		double biggest;

		System.out.println(" ------   Comparing 2 numbers using nested if ------  ");
		// 2st way

		if (num1 > num2) { // if number 1 larger than number 2
			if (num1 > num3) {
				biggest = num1;
			} else {
				biggest = num3;
			}
		} else {// number 2 is larger than number 1

			if (num2 > num3) {
				biggest = num2;
			} else {
				biggest = num3;
			}
		}

		System.out.println("The largest number is " + biggest);

	}
}
	


