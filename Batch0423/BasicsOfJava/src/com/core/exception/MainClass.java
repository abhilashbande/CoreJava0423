package com.core.exception;

import java.util.Scanner;

class AgeRestrictionException extends Exception {
	public AgeRestrictionException(String str) {
		super(str);
	}
}

public class MainClass {

	private static int acceptAge() throws AgeRestrictionException {
		System.out.print("Enter age : ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		if (age < 18) {
			// throw an exception -> AgeRestrictionException
			//AgeRestrictionException myException = new AgeRestrictionException("Exception : Age can not be lesser than 18");
			throw new AgeRestrictionException("Exception : Age can not be lesser than 18");
		}

		return age;
	}

	private static void divide() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter no 1 : ");
		int no1 = sc.nextInt();

		System.out.print("Enter no 2 : ");
		int no2 = sc.nextInt();

		try {
			int result = no1 / no2;
			// System.out.println("Divisio is : " + result);

			System.out.println("**** Execution of try is finished **** ");
		} catch (Exception e) {
			// System.out.println(e);
			System.out.println("**** Executing catch block **** ");
		} finally {
			// System.out.println("Closing scanner object...");
			sc.close();
			System.out.println("**** Executing finally block **** ");
		}

	}

	public static void main(String[] args)  {

		try {
			int age = acceptAge();
			// System.out.println("Entered age is : " + age);

			divide();

		} catch (Exception ie) {
			System.out.println(ie);
		} finally {
			// close the file.
		}
		

	}

}
