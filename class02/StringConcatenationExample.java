package com.syntax.class02;

public class StringConcatenationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="olga";

//i would like to say: my name is olga
System.out.println("My name is "+name);

String lastName="Sorrel";
// i would like to print Olga Sorrels

System.out.println(name+" "+lastName);
		
		String city="Miami";
		//olga lives in Miami
		System.out.println(name+" lives in "+city);
		
		char grade='B';
		//olga is a B student
		System.out.println(name+" is "+grade+" student");
		int age=21;
		//olga is 21 years old
		System.out.println(name+" is "+age+" years old");
		
		//to attach/concatenate any value(char, int, double, string)
		 //to a string we use + (String concatenation operator)
		int date=27;
		String month="Septembre";
		System.out.println(date+" "+month);
		String state="DC";
		String anotherState="  DC ";
		//above string are not equal, state has 2 characters and another state has 3 characters
        System.out.println(state);
        System.out.println(anotherState);
        
        
       
	
	
	
	}

}
