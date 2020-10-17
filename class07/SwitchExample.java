package com.syntax.class07;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		String month="January";
		//if month is december---->february---->winter
		//if month is march or april or may----->spring
		
		switch(month) {
		
		case "December":
		case "January":
		case "February":
			System.out.println("Winter");
			break;
		}
		
	}

}
