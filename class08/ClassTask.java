package com.syntax.class08;

import java.util.Scanner;

public class ClassTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Task 1
				System.out.println(" ---  Print numbers from 1 to 50 except those that are divisible by 3 --- ");
				for (int i = 1; i <= 50; i++) {

					if (i % 3 == 0) {
						continue;
					}
					System.out.print(i + " ");
				}

				// Task 2
				System.out.println();
				System.out.println(" ----                        TASK 2 -----            ");
				/*
				 * Create a program that will keep asking user to apply for a credit card. As
				 * soon you get "yes” from a user program should stop asking.
				 */

				Scanner scan = new Scanner(System.in);
				String response;

				do {

					System.out.print("Do you want to apply for credit card ");
					response = scan.nextLine();

				} while (!response.equalsIgnoreCase("yes"));

				System.out.print("You are selected ");

				// Task 3
				System.out.println();
				System.out.println(" ----    TASK 3  -----            ");
				/*
				 * Write a program that reads a range of integers (start and end point),
				 * provided by a user and then from that range prints the sum of the even and
				 * odd integers.
				 */

				System.out.println(" please enter start point number");
				int startPoint = scan.nextInt();
				
				System.out.println(" Please enter end point number ");
				int endPoint = scan.nextInt();
				
				int sumE = 0, sumO = 0;

				for (int i = startPoint; i <= endPoint; i++) {
					if (i % 2 == 0) {
						sumE += i;
					}
					if (i % 2 != 0) {
						sumO += i;
					}
				}
				System.out.println("sumE is " + sumE);
				System.out.println("sumO is " + sumO);

			}
		}
	


