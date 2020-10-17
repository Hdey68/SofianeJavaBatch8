package com.syntax.class05;

import java.util.Scanner;

public class ClassHomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         Scanner input=new Scanner(System.in);
         System.out.println("Please entre your Heights in inch:");
         int height=input.nextInt();
         if(height<60) {
        	 System.out.println("You are short");
         }
        	 if(height>=60 && height<72) {
        		 System.out.println("You are medium");
        	 }
        		 if(height>70) {
        			 System.out.println("You are tall");
        		 }
        	 }
         
	}


