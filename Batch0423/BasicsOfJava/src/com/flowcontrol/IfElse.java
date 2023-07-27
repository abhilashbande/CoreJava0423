package com.flowcontrol;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// flow control
		Scanner ip = new Scanner(System.in);
		// System.out.println("Enter your marks : ");
		// byte marks = ip.nextByte();
		//
		// // marks > 65 -> dist
		// if( marks > 65)
		// {
		// System.out.println("Congratulations....It's Distinction...");
		// }
		// // marks > 55 -> 1st
		// else if(marks > 55)
		// {
		// System.out.println("Congratulations....It's First class...");
		// }
		// // marks > 45 -> 2st
		// else if(marks > 35)
		// {
		// System.out.println("Congratulations....It's second class...");
		// }
		// // marks < 35 -> failed
		// else if(marks < 35)
		// {
		// System.out.println("Sorry....Failed...");
		// }

//		System.out.println("Enter your age : ");
//		short age = ip.nextShort();
		// if(age >= 18)
		// System.out.println("You are eligible to vote");
		// else
		// System.out.println("You are not eligible to vote");

		// Relational Operators
		// == equals to
		// != not equals to
		// > greater than
		// < less than
		// >= greater than or equals to
		// <= less than or equals to

		//
		// male - 21
		// female - 18
//		int age1 = ip.nextInt();
//		char gender = 'm';
		

//		if (gender == 'm' && age1 >= 21) {
//			System.out.println("Eligible");
//		} else if (gender == 'f' && age1 >= 18) {
//			System.out.println("Eligible");
//		} else {
//			System.out.println("Not Eligible");
//		}

		// if(gender == 'm')
		// {
		// if(age1 >= 21)
		// {
		// System.out.println("Eligible");
		// }
		// else
		// {
		// System.out.println("Not Eligible");
		// }
		// }
		// else if(gender == 'f')
		// {
		// if(age1 >= 18)
		// {
		// System.out.println("Eligible");
		// }
		// else
		// {
		// System.out.println("Not Eligible");
		// }
		// }
		int yearsOfExperience = 7;
		boolean hasRelevantCertification = true;
	
		
		if (yearsOfExperience >= 5 || hasRelevantCertification) {
		    System.out.println("The candidate is eligible to apply "
		    		+ "for the job");
		} else {
			System.out.println("The candidate does not meet the eligibility "
					+ "criteria");
		}
		
		
	}

}
