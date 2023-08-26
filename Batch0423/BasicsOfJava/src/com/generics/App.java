package com.generics;

public class App {
	
	// generic methods
	private  static <Z> void print(Z no1) {
		System.out.println(no1);
	}
	

	public static void main(String[] args) {

		GenericClass<Integer> iObj = new GenericClass<Integer>(10);
		System.out.println(iObj);
		
		GenericClass<String> sObj = new GenericClass<String>("ABCD");
		System.out.println(sObj);
		

	}

}
