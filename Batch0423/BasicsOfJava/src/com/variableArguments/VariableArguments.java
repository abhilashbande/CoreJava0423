package com.variableArguments;

public class VariableArguments {

	// variable arguments varargs
	public static int addition(int... no) {
		int addition = 0;
		for (int i : no) {
			addition += i;
		}
		return addition;
	}

	public static void printChar(char... c) {

		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}

		System.out.println();

		for (char i : c) {
			System.out.print(i);
		}
	}

	public static void print(String str, int... nos) {
		System.out.print(str + " => ");
		for (int i : nos) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(addition(10, 20));
		// System.out.println(addition(10, 20, 30));

		System.out.println(addition(54, 20, 56));
		// printChar('a', 'b', 'c', 'd');
		// print("India", 54, 65,87,98);
	}

}
