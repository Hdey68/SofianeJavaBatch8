package com.syntax.class10;

public class Task2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an array on integers and calculate the sum of all elements in an array.
		
		int[] integ= {10,15,20,25,30};
		int sum=0;
		for(int i=0; i<integ.length; i++) {
			sum+=integ[i];
			System.out.println(sum);
		}

	}

}
