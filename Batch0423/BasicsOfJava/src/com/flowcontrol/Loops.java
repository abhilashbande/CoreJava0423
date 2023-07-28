package com.flowcontrol;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print numbers from 1 to 10
		// System.out.println(1);
		// System.out.println(2);
		// System.out.println(3);
		// System.out.println(4);
		// System.out.println(5);
		// System.out.println(6);
		// System.out.println(7);
		// System.out.println(8);
		// System.out.println(9);
		// System.out.println(10);

		// initialization condition increment/decrement
//		for (int i = 1; i <= 10; ++i) // 2
//		{
//			System.out.println(i + " ");
//		}
		
		
		// keep adding numbers till the time user enters 0
		Scanner sc = new Scanner(System.in);
		/*int sum = 0;
		System.out.print("Enter your first number : " );
		int no = sc.nextInt();
		
		while(no != 0)
		{
			sum += no;			// sum = sum + no;
			System.out.print("Enter your next number " );
			no = sc.nextInt();
		}
		
		System.out.println("The sum is " + sum);
		*/
		
		// keep adding numbers till the time user enters 0
		
		// do ... while()
		
//		int sum = 0;
//		int no = 0;
//		
//		do {
//			System.out.print("Enter your next number :" );
//			no = sc.nextInt();
//			sum += no;
//		} while(no != 0); 
		
//		System.out.println("The sum is " + sum);
		
		// print numbers from 1 - 10
		int i = 1;
		while(i <= 10)
		{
			System.out.println(i++);
		}
		
		
		// pre increment is faster than post increment

	}

}
