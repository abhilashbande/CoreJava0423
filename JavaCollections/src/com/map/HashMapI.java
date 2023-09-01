package com.map;

import java.util.*;

public class HashMapI {

	// key and value pair - entry

	static Map<Integer, String> m = new HashMap<Integer, String>();

	// create
	private static void addToMap() {
		m.put(1, "Reetu");
		m.put(2, "Darshan");
		m.put(3, "Priti");
		m.put(4, "Priti");
		m.put(5, "Madhavi");

		m.putIfAbsent(6, "Nidhi");
		m.putIfAbsent(7, "Sharayu");

	}

	// read
	private static void print() {
//		System.out.println(m);

//		Set<String> set = new HashSet<String>();

//		for(String s : set) {
//			System.out.println(s);
//		}

		// Map<Integer, String> m = new HashMap<Integer, String>();

		for (Map.Entry entry : m.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}

	}

	private static void find() {
		if (m.containsKey(4)) {
			String data = m.get(4);
			System.err.println(data);
		} else {
			System.out.println("Key is not present in the map");
		}

	}

	private static void update() {
		m.replace(6, "Nidhi", "Rohit");
		m.replace(5, "Sandhya");
	}

	// delete
	private static void delete() {
		if (m.containsKey(4)) {
			m.remove(4);
			print();
			m.remove(1, "Reetu");
			print();
		} else {
			System.out.println("Key is not present in the map");
		}
//		Set<Integer> a = new HashSet<Integer>();
//		a.add(1);
//		a.add(3);
//		a.add(7);
//		
//		for (Integer key : a) {
//			m.remove(key);
//		}
//		
//		print();

	}

	public static void main(String[] args) {
		// create
		addToMap();

		// read
		print();

		// find
//		find();
//
//		// update
//		update();
//		print();
		// delete
		// delete();
	}

}
