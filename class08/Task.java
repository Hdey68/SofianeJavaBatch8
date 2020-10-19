package com.syntax.class08;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Print even numbers from 20 to 1
				for (int i = 20; i > 0; i--) {
					
					if (i % 2 == 0) {
						System.out.print(i+" ");
					}
				}
				System.out.println();
				System.out.println("___________________________________________");
				
				for(int i=20;i>1; i-=2) {
					System.out.print(i+" ");
				}
				
				System.out.println();
				System.out.println("__________________ odd numbers 20 and 50_________________________");
				
				for (int a=20; a<=50; a++) {
					if(a%2!=0) {
						System.out.print(a+"  ");
					}
				}
				
				System.out.println();
				System.out.println("___________________________________________");
				
				for(int d=21; d<=50;d+=2) {
					System.out.print(d+"  ");
				}
				
				System.out.println();
				
				
				
				System.out.println("__________________ what will be the output_________________________");
				
				int sum=0;
				
				for (int i=1; i<6; i++) {
					
					sum=sum+i;
				}
				
				System.out.println(sum);
				
				System.out.println("__________________ _________________________");
				
				int a;
				
				for (a=1; a<6; a++) {
					System.out.println("Value fo a inside the loop "+a);
				}
				
				System.out.println("Value for a outside of for loop "+a);
				
				System.out.println("__________________ what will be the output_________________________");
				
				int result=1;
				
				for (int i=10; i>=1; i-=2) {
					
					result*=i;
					
					System.out.println("Result ="+result);//10, 80, 480, 1920, 3840
				}
				
				System.out.println("__________________ _________________________");
				//Calculate sum of even and odd numbers from range 1 to 50
				
				int sumO=0;
				int sumE=0;
				
				for (int n = 1; n < 51; n++) {
					
				    if (n%2 == 0) {
				        sumE+= n;
				    }else {
				        sumO+= n ;
				    }
				}
				System.out.println("The sum of even number from 1 to 50 is " + sumE);
				System.out.println("The sum of even number from 1 to 50 is " + sumO);
				
				System.out.println("__________________ _________________________");
				//I want to create a multiplication table
				/*
				 * 1x1=1
				 * 1x2=2
				 * 1x3=3
				 * 
				 * 
				 * 1x10=10
				 */
				
				Scanner scan=new Scanner(System.in);
				System.out.println("Please enter which number");
				int num1=scan.nextInt();
				int mult;
				
				for (int i=1; i<=10; i++) {
					
					mult=num1*i;
					System.out.println(num1+" x "+i+" = "+mult);
				}
	}
		}
