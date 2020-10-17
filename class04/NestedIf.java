package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * variable for allergy -yes or no
		 * 
		 * if allergy is yes--->
		 *                  we will check if pet allergy
		 *                                if peanut allergy
		 *                                if pollen allergy
		 *                                
		 * if allergy is no  you are lucky!!!                                
		 */
		
		
		boolean allergy=true;
		boolean petAllergy=false;
		boolean pollenAllergy=true;
		
		
		
		if (allergy) {
			System.out.println("let s do further check");
			
		        if(petAllergy) {
			       System.out.println("please no cats or dogs in the house");
		       }else {
			       System.out.println("that is good you do not have pet allergy");
		      }
			
			
			
		}else {
			System.out.println("you are luccky");
		}
  System.out.println("-------------------EXAMPLE2--------------------------------");
	/* 
	 * if today is Friday we will watch movie but would like to check the date
	 * if date is 13  watching scary movie
	 * and it s not  i will watch comedy action
	 * 
	 * if no Friday  i am studying
	 */
	 
	
	
	boolean isFriday=true;
	int date=13;
	
	if (isFriday) {
		
		if(date==13) {
			System.out.println("I  will watch scary movie");
		}else {
			System.out.println("I will watch PK movie with amir khan");
		}
		
	}else {
		
		System.out.println("Today is not Friday, i am studing");
	}
		
	System.out.println("----------------Example3------------------------------");
	
	
	
	
	}
	
	
	}
  

