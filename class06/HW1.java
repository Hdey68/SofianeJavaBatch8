package com.syntax.class06;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input;
		double sales;
		double commission;

		input = new Scanner(System.in);

		System.out.println("Please Enter Sales Amount?");
		sales = input.nextDouble();

		if (sales >= 10 && sales < 100) {
			commission = (sales * 10) / 100;

		} else if (sales >= 100 && sales < 200) {
			commission = (sales * 20) / 100;

		} else if (sales >= 200 && sales < 500) {

			commission = (sales * 30) / 100;
		} else if (sales >= 500) {

			commission = (sales * 50) / 100;
		} else {

			commission = 0;
		}

		System.out.println("You will get $" + commission + " commission.");

		// if you sell more that 1K --> you are an awesome seller

		if (commission > 1000) {
			System.out.println("You are an awesome seller");
		}
	}

}
	


