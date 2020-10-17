package com.syntax.class07;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean workday=true;
		int day=1;
		
		
		while(workday) {
			
			if(day<6) {
			System.out.println("I need day off");
			
			}else {
				System.out.println("It s a weekend and i am off");
				workday=false;
			}
			day++;
		}

	}
}
