package com.core.string;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str1 ="test";
//		//String str2 = "test";
//		str1 = "India";
//		str1 += " is my country";
//		System.out.println(str1);
//		str1 += ".";
		

		// sb -> is not thread safe
		// thread safe
		
		
		StringBuffer s1 = new StringBuffer();
		System.out.println("capacity " + s1.capacity());
		s1.append("Java");
		System.out.println(s1);
		s1.append(" is easy.");
		System.out.println(s1);
		s1.append(" I'm learning it.");
		System.out.println("capacity " + s1.capacity());
		System.out.println(s1.length());
//
//		if (str1 == str2 ) {
//			System.out.println("Strings are equal");
//		} else {
//			System.out.println("Strings are not equal");
//		}
	}

}
