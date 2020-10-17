package com.syntax.class05;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {

      Scanner scanner;
      scanner=new Scanner(System.in);
      
      //i want to capture a sentence:
      String sentence=scanner.nextLine();
      System.out.println("You entered sentence: "+sentence);
      
      //i want to capture a number
      int number=scanner.nextInt();
      System.out.println("You entered number: "+number);
      
      // i want to capture 1 word
      String word=scanner.next();
      System.out.println("You entered word "+word);
      
      //i want to enter 1 character
      char singleCharacter=scanner.next().charAt(0);
      System.out.println("You entered character "+singleCharacter);
      
      
      


	}

}
