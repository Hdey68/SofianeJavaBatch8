package com.syntax.class10;

public class Task2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an array of cars and store 6 elements into it. Print all values from the array.
		
		
		  String[] cars= {"Honda","Toyota","Renault","Peugeot","Volswagon","Opel"};
	
		  System.out.println(cars[0]+" - "+cars[1]+" - "+cars[2]+" - "+cars[3]+" - "+cars[4]+" - "+cars[5]);
	
		  System.out.println("----------------another way----------");
		  
		  String[] car = { "Honda", "Toyota", "Renault", "Peugeot", "Volswagon","Opel"};
			for(int i = 0;i<car.length;i++) {
				System.out.print(car[i] + " - ");
}
}
}