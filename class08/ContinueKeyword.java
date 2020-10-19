package com.syntax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// I want to print numbers from 1 to 5 except number 3

				for (int i = 1; i <= 5; i++) {

					if (i == 3) {
						continue;
					}

					System.out.println(i);
				}

				System.out.println("End of the loop");
				
				System.out.println(" ----------------------------- ");
				// I want to print numbers from 1 to 10 except number 3 & 7
				
				for(int i=1; i<=10; i++) {
					
					if (i==3 || i==7) {
						continue;
					}
					
					System.out.println(i);
				}
	}

}
