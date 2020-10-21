
package com.syntax.class09;

public class PrintingPatternsBestWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for (int r = 1; r <= 4; r++) { // outer loop control rows

			for (int c = 1; c <= 6; c++) { // inner loop control cols
				System.out.print("*");
			}

			System.out.println();
		}

		System.out.println("  -----------------------  BIG SQUARE --------------------------");

		for (int i = 1; i <= 6; i++) {

			for (int a = 1; a <= 12; a++) {
				System.out.print("$");
			}

			System.out.println();
		}

		System.out.println("  -----------------------  SQUARE of numbers --------------------------");

		/*
		 * 11111111 
		 * 22222222 
		 * 33333333 
		 * 44444444
		 */

		for (int r = 1; r <= 4; r++) {

			for (int c = 3; c <= 10; c++) {

				System.out.print(r);

			}

			System.out.println();
		}

		System.out.println("  -----------------------  SQUARE of numbers --------------------------");
		/*
		 * 777777 
		 * 666666 
		 * 555555 
		 * 444444 
		 * 333333 
		 * 222222 
		 * 111111
		 */

		for (int i = 7; i >= 1; i--) {
			
			for (int j = 1; j <= 6; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("  -----------------------  SQUARE of numbers --------------------------");
		/*
		 * 7654321 
		 * 7654321 
		 * 7654321
		 * 7654321 
		 * 7654321
		 */
		
		for (int r = 1; r <=5; r++) {//we do not care about what is the value of r, as long as it gives 5 rows
			
			for (int c = 7; c >= 1; c--) {
				System.out.print(c);
			}
			System.out.println();
		}

	}
}
	
