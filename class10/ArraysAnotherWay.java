package com.syntax.class10;

public class ArraysAnotherWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = { "Mike", "Burju", "Jack", "Danilo", "Bryan", "Evgeniya" };
		//String[] name;
				// name= {"Sabeen"}; we can not do it in 2 steps this way
				System.out.println(names[3]);

				// how do I know how many elements I have in the array?
				int size = names.length;
				System.out.println("Size of names array = " + size);

				System.out.println(names[names.length - 2]);// Danilo

				int a = 2;
				System.out.println(names[a]);// Jack

				a += 2;
				System.out.println(names[a]);// Bryan

				for (int i = 0; i < names.length; i++) {

					System.out.println(names[i]);
				}

				System.out.println(" ----------------------------------------------------");

//				for (int i = 0; i <= names.length; i++) { we will get an exception because length will be 6
				// and highest index we have 5
		//
//					System.out.println(names[i]);
//				}

				for (int i = 0; i <= names.length-1; i++) {

					System.out.println(names[i]);
				}

			}
		
}


