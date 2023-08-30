package com.list;

import java.util.LinkedList;

public class LinkedListImplementation {
	static LinkedList<Integer> list = new LinkedList<Integer>();
	
	private static void addToList() {
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
	}
	
	private static void printList() {
		System.out.println(list);
		
//		for (Integer i : list) {
//			System.out.print(i + " ");
//		}
	}
	
	private static void update(Integer oldData,Integer newData) {
		int index = list.indexOf(oldData);
		if(index != -1)
			list.set(index, newData);
		else
			System.out.println("Record not found...");
	}
	
	private static void update() {
		update(4, 44);
		update(1, 11);
	}
	
	public static void main(String[] args) {
		
		// CREATE
		addToList();
		// READ
		printList();
		
		// UPDATE
		update();
		printList();
		
		// DELETE
		
		// FIND
		// SORT
		
		
	}

}
