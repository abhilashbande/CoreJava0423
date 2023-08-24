package com.core.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class AgeRestrictionException extends Exception {
	public AgeRestrictionException(String str) {
		super(str);
	}
}

public class MainClass {

	private static int acceptAge() throws Exception {
		System.out.print("Enter age : ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		int arr[] = new int[2];
		arr[10] = 390;

		if (age < 18) {
			// throw an exception -> AgeRestrictionException
			throw new AgeRestrictionException("Exception : Age can not be lesser than 18");
		}

		return age;
	}

	public static void main(String[] args) {

		try {
			int age = acceptAge();
			System.out.println("Entered age is : " + age);
		} catch (Exception ie) {
			System.out.println(ie);
		}
	}

}
