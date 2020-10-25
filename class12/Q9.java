package com.syntax.class12;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create an array of countries: north america countries, south america
		 * countries, europe countries, asian countries, african countries. Then print
		 * all values from that array using 2 different loops and calculate how many
		 * total countries been stored.
		 */

		String[][] countries = {

				{ "USA", "Canada", "Mexico", "Cuba" }, 
				{ "Brazil", "Argentina", "Colombia", "Peru" },
				{ "Ukraine", "Italy", "France" }, 
				{ "Japan", "Indonesia", "China", "India" },
				{ "Nigeria", "Kenya", "Ethiopia" }

		};

		int sum = 0;

		for (String[] c : countries) {
			
			for (String name : c) {
				System.out.print(name + ". ");
				sum++;
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Total number of countries that has been stored is " + sum);

		
		System.out.println();
		System.out.println("--------------different loop--------------");
		
		int total = 0;

		for (int i = 0; i < countries.length; i++) {

			total = total + countries[i].length;
			for (int j = 0; j < countries[i].length; j++) {
				System.out.print(countries[i][j] + ". ");

			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Total number of countries that has been stored is " + total);
	}
}

	


