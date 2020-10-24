package com.syntax.class10;

public class Task3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create an array of countries.
		// While retrieving all values from an array print capital for each country.
		// (use 2 different loops).
		
		String[] countries= {"Algeria","Morocco","France","Spain"};
		String[] capitals= {"Algiers","Rabat","Paris","Madrid"};
		
		for(int i=0; i<countries.length; i++) {
		
		System.out.println("The capital of "+countries[i]+" is "+capitals[i]);
		}
		System.out.println("----------------another way----------");
		  
		
		System.out.println("The capital of "+countries[0]+" is "+capitals[0]);
		System.out.println("The capital of "+countries[1]+" is "+capitals[1]);
		System.out.println("The capital of "+countries[2]+" is "+capitals[2]);
		System.out.println("The capital of "+countries[3]+" is "+capitals[3]);
	}

}
	
