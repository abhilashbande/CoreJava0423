package com;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// byte short int long

		// single line comment

		/*
		 * this is multiline comment
		 * 
		 */

		byte b = 3;
		System.out.println("The byte data is : " + b);
		System.out.println("Minimum value of byte is : " + Byte.MIN_VALUE);
		System.out.println("Maximum value of byte is : " + Byte.MAX_VALUE);

		short s = 654;
		System.out.println("\nThe short data is : " + s);
		System.out.println("Minimum value of Short is : " + Short.MIN_VALUE);
		System.out.println("Maximum value of Short is : " + Short.MAX_VALUE);

		int i = 234523;
		System.out.println("\nThe int data is : " + i);
		System.out.println("Minimum value of int is : " + Integer.MIN_VALUE);
		System.out.println("Maximum value of int is : " + Integer.MAX_VALUE);

		long l = 234566;
		System.out.println("\nThe long data is : " + l);
		System.out.println("Minimum value of long is : " + Long.MIN_VALUE);
		System.out.println("Maximum value of long is : " + Long.MAX_VALUE);

		// float - double --> decimal data
		float f = 657.45f;
		System.out.println("\nThe float data is : " + f);
		System.out.println("Minimum value of float is : " + Float.MIN_VALUE);
		System.out.println("Maximum value of float is : " + Float.MAX_VALUE);

		double d = 65724.23;
		System.out.println("\nThe double data is : " + d);
		System.out.println("Minimum value of double is : " + Double.MIN_VALUE);
		System.out.println("Maximum value of double is : " + Double.MAX_VALUE);

		char ch = 'r';
		System.out.println("\nThe Char data is : " + ch);

		boolean bool = false;
		System.out.println("\nThe bool data is : " + bool);

		String str = "India is my country";
		System.out.println(str);

	}

}
