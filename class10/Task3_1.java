package com.syntax.class10;

public class Task3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an array of animals and store 6 elements into it.
		// Using 2 different loops print all elements from the array.
		
		String[] animal= {"cat","dog","lion","cougar","puma","camel"};
		System.out.println(animal[0]+" - "+animal[1]+" - "+animal[2]+" - "+animal[3]+" - "+animal[4]+" - "+animal[5]);
		
		  System.out.println("----------------another way----------");
		
		String[] animals= {"cat","dog","lion","cougar","puma","camel"};
		for(int i=0; i<animal.length; i++) {
			System.out.print(animal[i]+" , ");
		}
		System.out.println();
		System.out.println("---------------------another way---------");
	
	   for(String anml_name:animals) {
		   System.out.print(anml_name+ ", ");
	   }
	}	
	
}		
           
		



