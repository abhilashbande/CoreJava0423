package com.list;

import java.util.ArrayList;

public class ArrayListImplementation {
	// default capacity 10
	// load factor 0.75
	static ArrayList<String> list = new ArrayList<>();

	private static void addToList() {
		list.add("Paresh");
		list.add("Samiksha");
		list.add("Saurabh");
		list.add("Latesh");
		list.add("Prashant");
		list.add(0, "Darshan");
		list.add(4, "Tanisha");
		list.add(0, "Seher");
//		list.add(0, "Madhura");
//		list.add("Madhura");
//		list.add(0, "Akash");
//		list.add(2, "Akash");
	}

	private static void printList() {
		System.out.println(list);

//		for (String name : list) {
//			System.out.print(name + ", ");
//		}
	}

	private static void removeName() {
		list.remove("Akash");
		list.remove(6);
	}

	private static void updateRecord(String oldRecord, String newRecord) {
		int index = list.indexOf(oldRecord);
		if (index != -1) {
			list.set(index, newRecord);
		} else {
			System.out.println("Record not found...");
		}
	}

	private static void updateRecord() {
		updateRecord("Paresh", "Yash");
		updateRecord("Sital", "Mercy");

	}

	public static void main(String[] args) {

		// C
		// System.out.println("Before addiing -> Size : " + list.size());
		addToList();
		// System.out.println("After addiing -> Size : " + list.size());

		// R
		printList();
		list.sort(null);
		printList();

		// U
//		updateRecord();
//
//		// D
//		removeName();
//		printList();
//
//		System.out.println(list.indexOf("Akash"));
//		System.out.println(list.lastIndexOf("Madhura"));


		// list.clear();
		// printList();
		
		
		ArrayList<String> newList = new ArrayList<String>();
		newList.add("Aditi");
		newList.add("Ajinkya");
		newList.add("Rohit");
		newList.add("Nidhi");
		
		list.addAll(newList);
		printList();

	}

}
