package com.in28minutes.loops;

import java.util.Scanner;

public class MenuRepeatedRunner {
	public static void main(String[] args) {
		// Type obj = new Type (argument);
		Scanner scanner = new Scanner(System.in);

		int number1;
		int number2;
		int choice;
		do {
			System.out.print("Enter Number1: ");
			number1 = scanner.nextInt();

			System.out.print("Enter Number2: ");
			number2 = scanner.nextInt();

			System.out.println("Choices available are: ");
			System.out.println("1 - Add");
			System.out.println("2 - Subtract");
			System.out.println("3 - Divide");
			System.out.println("4 - Multiply");
			System.out.println("5 - Exit");

			System.out.print("Enter Choice: ");
			choice = scanner.nextInt();

			System.out.println("Your choices are: ");
			System.out.println("Number1: " + number1);
			System.out.println("Number2: " + number2);
			System.out.println("Choice: " + choice);

			switch (choice) {
			case 1:
				System.out.println("Result: " + (number1 + number2));
				break;
			case 2:
				System.out.println("Result: " + (number1 - number2));
				break;
			case 3:
				System.out.println("Result: " + (number1 / number2));
				break;
			case 4:
				System.out.println("Result: " + (number1 * number2));
				break;
			case 5:
				System.out.println("You have chosen to exit the program. See you soon!");
				break;
			default:
				System.out.println("Invalid operation. Try again:) !");
				break;
			}

		} while (choice != 5);
	}
}