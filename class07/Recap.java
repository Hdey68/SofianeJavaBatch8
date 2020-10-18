package com.syntax.class07;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String timeOfDay = "Morning";
		String day = "Saturday";

		switch (timeOfDay) {

		case "Morning":
			System.out.print("Good Morning ");

						switch (day) {
						case "Monday":
							System.out.println("Colleague");
							break;
						case "Thursday":
							System.out.println("Asghar");
							break;
						case "Saturday":
							System.out.println("Class");
							break;
						}

			break;
		case "Noon":
			System.out.println("Good Afternoon");
			break;
		case "Evening":
			System.out.println("Good Evening");
			break;
		case "Night":
			System.out.println("Good Night");
			break;
		default:
			System.out.println("N/A");
		}
	}
}
	


