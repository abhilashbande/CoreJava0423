package com.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetI {

	// no duplicate values/elements
	// it uses hashing mechanism - conversion from an object to int
	static Set<String> set = new HashSet<String>();

	// create
	private static void addToList() {
		set.add("Prachi");
		set.add("prachi");
		set.add("Reetu");
		set.add("Sonam");
		set.add("Sonam");
		set.add("");
		set.add("");
		set.add(null);
		set.add(null);
	}

	// read
	private static void print() {
		System.out.println(set);

//		for (String entry : set) {
//			System.out.print(entry + " ");
//		}
	}

	private static void find() {
		if (set.contains("Prachi1234"))
			System.out.println("Element found");
		else
			System.out.println("Element not found");
	}

	// delete
	private static void remove() {
		if (set.remove("Akash"))
			System.out.println("Element removed");
		else
			System.out.println("can not remove element");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create
		addToList();

		// read
		print();

//		// find
//		find();
//		
//		// delete
//		remove();
//		print();

	}

}
