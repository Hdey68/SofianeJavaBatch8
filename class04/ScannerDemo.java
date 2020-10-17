package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=80;
		String str="I am a String";
		
		Scanner scan=new Scanner(System.in);
		String value=scan.nextLine();
		
		System.out.println("I capture String value= "+value);
		

	}

}
