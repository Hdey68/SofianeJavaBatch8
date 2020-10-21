package com.syntax.class09;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a=10;
		System.out.println("Value of single variable "+a);
		
		
//		int student1=90;
//		int student2=97;
//		int student3=85;
//		int student4=67;
//		int student5=54;
//		int student6=67;
		
		int[] num = new int[5];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		
		//to access element from an array?
		System.out.println("Accessing 3 element "+num[2]);
		
		System.out.println(num[1]+num[4]);
		
		//I would like to change 50 to 100;
		num[4]=100;
		
		System.out.println("Value of 5th element after change "+num[4]);
	
	}
}
	


