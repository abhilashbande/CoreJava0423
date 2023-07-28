package com.methods;

public class Methods {

	public static void printNumbers(int start, int end) {
		for (int i = start; i <= end; ++i) {
			System.out.print(i + " ");
		}
		System.out.print("\n");

	}

	// polymorphism
	//
	// compile-time polymorphism / static-> method overloading
	// run-time polymorphism / dynamic-> method overriding

	// same methods name
	// number of parameters is diff
	// sequence of parameters is diff
	// return type does not matter

	// return type	NO -> WHY?
	// name mangling
	
	// addition&int&int
	public static void addition(int no1, int no2) {
		System.out.println("Addition is int : " + (no1 + no2));
	}

	// addition&int&double
	public static int addition(int no1, double no2) {
		System.out.println("Addition is int : " + (no1 + no2));
		return 0;
	}

	public static void addition(double no1, int no2) {
		System.out.println("Addition is int : " + (no1 + no2));
	}

	public static void addition(double no1, double no2) {
		System.out.println("Addition is double : " + (no1 + no2));
	}

	public static void addition(int no1, int no2, int no3) {
		System.out.println("Addition is 3 integers : " + (no1 + no2 + no3));
	}

	public static int diff(int no1, int no2) {
		int result = no1 - no2;
		if(no1 == 0 && no2 == 0)
		{
			return 0;
		}
		System.out.println("Result is " + result);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// printNumbers(10, 20);
		// printNumbers(5, 15);
		// printNumbers(50, 75);

		// int amountDiff = diff(30, 10);
		System.out.println(diff(30, 10));
		
		
		// addtion(12.45, 76, 43, 65);
		// addition(10, 20);
		// addition(10, 20, 56);
		// addition(34, 46.45);
		// addition(45.65, 12);
		// addition(10.1, 20.2);
		// addition(10, 20.54);

	}

}
