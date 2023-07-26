package com;

import java.util.Scanner;

public class ReadInputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
//		System.out.print("Enter your name : ");
//		String name =  input.next();
//		System.out.println("Hello, " + name);
		
//		System.out.print("Enter your full name : ");
//		String fullName =  input.nextLine();
//		System.out.println("Hello, " + fullName);
		
		System.out.print("Enter your age : ");
		int age = input.nextInt();
		
		System.out.println("Your age is " + age);

	}

}
