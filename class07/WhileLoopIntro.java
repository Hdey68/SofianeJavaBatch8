package com.syntax.class07;

public class WhileLoopIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int time = 15;

		if (time > 12) { // condition is true
			System.out.println("good day"); // code executes 1 time
		}

		System.out.println(" ------------------ WHILE LOOP  -----------------");

//		while (time > 12) {
//			System.out.println("good day");//INFINITE LOOP
//		}

//		while (time > 12) {
//			System.out.println("good day");//how many times? INFINITE LOOP
//			time++;
//		}

		while (time > 12) {
			System.out.println("good day");// how many times? = 3
			time--;
		}

		// I want to print numbers from 1 to 50
		System.out.println(" PRINTING NUMBERS 1 TO 50 -------------------");
		int num = 1;

		while (num <= 50) {
			System.out.println(num);
			num++;
		}

		// I want to print numbers from 10 to 60
		System.out.println(" PRINTING NUMBERS 10 TO 60 -------------------");

		int a = 10;

		while (a <= 60) {
			System.out.print(a + " ");
			a++;
		}

		System.out.println();
		// I want to print numbers from 100 to 60
		System.out.println(" PRINTING NUMBERS 100 TO 60 -------------------");

		int b = 100;

		while (b >= 60) {
			System.out.print(b + " ");
			b--;
		}

		System.out.println();
		// I want to print numbers from 10 to 30 only even numbers
		System.out.println(" PRINTING NUMBERS 10 TO 30 ONLY EVEN-------------------");

		int d = 10;

		while (d <= 30) {
			System.out.print(d + " ");
			d += 2;
		}

		System.out.println(" -- Another way ---- ");

		int c = 10;

		while (c < 31) {

			System.out.println("I am inside while loop ");

			if (c % 2 == 0) {
				System.out.print(c + " ");
				// c++; // --> if we keep increment here --> we will get infinite loop
			}

			c++;
		}

		System.out.println("End of the code");

		// print numbers from 100 to 1 (odd numbers only)

		int e = 99;

		while (e > 0) {
			System.out.print(e + " ");
			e -= 2;
		}

		System.out.println(" Another way");

		int f = 100;

		while (f > 0) {

			if ((f % 2) != 0) {
				System.out.print(f + " ");
			}
			
			f--;
		}
	}

	}


