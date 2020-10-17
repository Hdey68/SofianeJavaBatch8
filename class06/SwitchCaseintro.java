package com.syntax.class06;

import java.util.Scanner;

public class SwitchCaseintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
           Scanner input=new Scanner(System.in);
           System.out.println("Please enter the day");
           String today;
           int day=input.nextInt();
           switch(day) {// datatype of the variable must match with datatype of cases
           
           case 1:
               today="Monday";
               break;
           case 2:
        	   today="Tuesday";
        	   break;
           case 3:
               today="Wednesday";
               break;
           case 4:
               today="Thursday";
               break;
           case 5:
               today="Friday";
               break;
           case 6:
               today="Saturday";
               break;
           case 7:
               today="Sunday";
               break;
           default:
        	   today="Invalid Day";
        	   // break----. is optional since it is the last statement in the switch block
        	   
           }
           System.out.println("Today is "+today);
	}

}
