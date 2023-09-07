package com.lamdaEx;

import java.util.ArrayList;

// functional interface - interface with only one abstract method
interface Arithmatic {
	int add(int no1, int no2);
}

interface Greet {
	String greet();
}

// option 1 - 
//class Addition implements Arithmatic {
//
//	@Override
//	public int add(int no1, int no2) {
//		return no1 + no2;
//	}
//	
//}

public class App {

	public static void main(String[] args) {

		// option 2 - anonymous class
//		Arithmatic calculator = new Arithmatic() {
//			@Override
//			public int add(int no1, int no2) {
//				return no1 + no2;
//			}
//		};
//
//		System.out.println(calculator.add(10, 20));
		
		// option 3 - lambda expressions
//		Arithmatic cal = (int a, int b) -> {
//			return a+b;
//		};
//		
//		System.out.println(cal.add(10, 30));
		
//		Greet g = () -> {
//			return "Good morning ";
//		};
//		
//		System.out.println(g.greet());
		
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Prashant");
		names.add("Rajat");
		names.add("Sharayu");
		names.add("Madhura");
		names.add("Aditi");
		names.add("Pavan");
		
		for (String name : names) {
			System.out.print(name + " ");
		}
		System.out.println();
		
		names.forEach((name) -> System.out.print(name + " "));

	}

}
