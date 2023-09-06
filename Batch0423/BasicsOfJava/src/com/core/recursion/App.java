package com.core.recursion;

public class App {

	// recursion - function calling itself
	private static int factorial(int no) {
		if (no >= 2)
			return no * factorial(no - 1); // 5 * 4 * 3 * 2 * 1
		else
			return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));
	}

}
