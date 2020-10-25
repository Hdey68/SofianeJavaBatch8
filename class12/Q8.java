package com.syntax.class12;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a 2D array to store numbers and calculate sum of all odd numbers.

				int[][] number = { 
						{ 1, 2, 3 }, 
						{ 4, 5, 6 }, 
						{ 7, 8, 9 } 
						};
				int sum = 0;

				System.out.println("****2D Array*****");
				
				for (int[] original : number) {
					for (int orig : original) {
						
						if (orig%2!=0) {
							sum+=orig;
						}
					}
					
				}
				System.out.println("Sum of odd numbers ="+sum);
				
				int sum1=0;
				System.out.println("****2D Array Odd number*****");
				for (int i = 0; i < number.length; i++) {
					for (int j = 0; j < number[i].length; j++) {
						if ((number[i][j] % 2) != 0) {
							sum1 = sum1 + number[i][j];
						}
					}
				}
				System.out.println("Sum of all odd numbers " + sum1);
			}
		}

	


