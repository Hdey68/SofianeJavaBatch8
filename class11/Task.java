package com.syntax.class11;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String [][] array= {
				
				{"Mr", "Mrs", "Ms", "Miss"},
				{"Smith", "Jordan", "Jackson", "Obama"}
				
		};
		
		System.out.println(array[0][1]+" "+array[1][0]);
		System.out.println(array[0][0]+" "+array[1][3]);
		System.out.println(array[0][2]+" "+array[1][2]);
		System.out.println(array[0][3]+" "+array[1][1]);
		
		System.out.println(" ---------------------------------------------");
		
		String[][] cars= {
				
				{"Jeep", "Ford", "Dodge"},
				{"Audi", "Porsche", "BMW"},
				{"Kia", "Hyundai", "Hyundai sonata"},
				{"Ferrari", "Maserati", "Lamborghini"},
				
		};
	
		for(String[] carArray:cars) {
			
			for(String car:carArray) {
				
				System.out.println(car+"    ");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------------------------------------");
		
		for(int i=0; i<cars.length; i++) {
			
			for (int j=0; j<cars[i].length; j++) {
				
				String car=cars[i][j];
				System.out.print(car+"     ");
			}
			System.out.println();
		}
		
	}

	}


