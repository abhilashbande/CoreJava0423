package com.flowcontrol;

import java.util.Scanner;

public class SwitchCase {


	public static void main(String[] args) {
		
		
		Scanner ip = new Scanner(System.in);
		char c = ip.next().charAt(0); 
		
		System.out.println(c);
		// a
		char grade = 'B';
		int age = 1;
		float f = 1.5f;
		switch (grade) {		
		case 'A':
			System.out.println("You have 65+ marks");
			System.out.println("You have 65+ marks");
			System.out.println("You have 65+ marks");
			break;
		case 'B':
			System.out.println("You have 55+ marks");
			break;
			
		case 'C':
			System.out.println("You have 45+ marks");
			break;

		default:
			System.out.println("Invalid choice");

		}

	}

}
