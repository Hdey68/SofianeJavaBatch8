package com.syntax.class12;

public class Q5_FromEd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int[] array = { 200, 5, 7, 89, 45 };
		
        int max = array[0];
        
        for (int d = 1; d < array.length; d++) {
            if (array[d] > max) {
                max = array[d];
            }
        }
        
        int max2 = 0;
        
        for (int q = 0; q < array.length; q++) {
            if (array[q] == max) {
                continue;
            } else if (array[q] > max2) {
                max2 = array[q];
            }
        }
        
        System.out.println("largest number is " + max);
        System.out.println("second largest number is " + max2);
		
	}
}

	


