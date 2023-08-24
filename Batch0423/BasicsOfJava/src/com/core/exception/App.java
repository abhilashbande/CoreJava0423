package com.core.exception;

import java.util.Scanner;

public class App {

	private static Scanner sc = new Scanner(System.in);

	private static int menu() {
		System.out.println("\n1. Addition");
		System.out.println("2. Substract");
		System.out.println("3. Multiply");
		System.out.println("4. Division");
		System.out.println("0. Exit");
		System.out.print("Enter your choice :: ");
		int choice = sc.nextInt();
		return choice;

	}

	// 3 types mistake/errors
	// 1. logical error
	// 2. compiler/systex error
	// 3. exceptions

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// calculator
		int userChoice = -1;
		do {
			try {
				// print menu
				userChoice = menu();
				if (userChoice != 0) {
					int no1, no2;
					System.out.print("Enter first number :: ");
					no1 = sc.nextInt();
					System.out.print("Enter second number :: ");
					no2 = sc.nextInt();
					// based on the choice, perform operations
					switch (userChoice) {
					case 1:
						// addition
						System.out.println("\nAddition is " + (no1 + no2));
						break;

					case 2:
						// sub
						System.out.println("\nDifference is " + (no1 - no2));
						break;

					case 3:
						// mul
						System.out.println("\nMultiplication is " + (no1 * no2));
						break;

					case 4:
						// division
						System.out.println("\nDivision is " + (no1 / no2));
						break;

					default:
						System.out.println("Error : Invalid choice!!!");
						break;
					}
				}
			} catch (Exception e) {
				System.out.println(e);
				sc.next();
				
			}
		} while (userChoice != 0);

		System.out.println("Thanks for using our application...:)");

	}

}
