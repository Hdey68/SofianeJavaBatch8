
	   
		package com.syntax.class09;

		public class NestedLoopDemo {

			public static void main(String[] args) {

				for (int i = 0; i < 5; i++) {// outer loop

					System.out.println("Hello");

					for (int y = 0; y < 3; y++) {// inner loop

						System.out.println("Bye");
					}
				}

				System.out.println(" ------------ MORE EXAMPLES --------------");

				for (int i = 1; i <= 10; i++) {

					for (int j = 1; j <= 4; j++) {

						System.out.println("i =" + i + " j=" + j);
					}

					System.out.println();
				}

				System.out.println(" ------------ how can I print numbers from 10 to 99 using nested loop --------------");

//				for (int i=10; i<=99; i++) {
//					System.out.println(i+" ");
//				}

				for (int i = 1; i <= 9; i++) {

					for (int j = 0; j <= 9; j++) {

						System.out.println(i + "" + j);
					}
				}

				System.out.println(" ------------ how can I print clock ---------------------");

				for (int h = 0; h < 24; h++) {

					for (int m = 0; m < 60; m++) {

						if (h < 10) {

							if (m < 10) {
								System.out.println("0" + h + ":0" + m);
							} else {
								System.out.println("0" + h + ":" + m);
							}

						} else {

							if (m < 10) {
								System.out.println(h + ":0" + m);
							} else {
								System.out.println(h + ":" + m);
							}
						}
					}
				}
				
				System.out.println(" ------------ how can I print clock ---------------------");

				for (int h = 0; h < 24; h++) {

					for (int m = 0; m < 60; m++) {
						
						if (h<10 && m<10) {
							System.out.println("0" + h + ":0" + m);
							
						}else if (h<10 && m>10) {
							System.out.println("0" + h + ":" + m);
						}
						
					}}

				System.out.println(" ------------ how can I print car odometer ---------------------");
				
				 for(int a=0; a<10; a++) {
					 for(int b=0; b<10; b++) {
						 for(int c=0; c<10;c++) {
							 for(int d=0;d<10; d++) {
								 for(int e=0;e<10;e++) {
									 System.out.println(a+""+b+""+c+""+d+""+e);
								 }
							 }
						 }
					 }
				 }
			}
		}