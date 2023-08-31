package com.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetI {

	static Set<String> set = new LinkedHashSet<String>();

	// create
	private static void addToList() {
		set.add("Prachi");
		set.add("prachi");
		set.add("Reetu");
		set.add("Sonam");
		set.add("Sonam");
		set.add(null);
	}

	// read
	private static void print() {
		System.out.println(set);

//			for (String entry : set) {
//				System.out.print(entry + " ");
//			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create
		addToList();

		// read
		print();
	}

}
