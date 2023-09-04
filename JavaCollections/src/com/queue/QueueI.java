package com.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueI {

	static PriorityQueue<String> q = new PriorityQueue<String>();

	// create/add records
	private static void addToQueue() {
		q.add("Prashant");
		q.add("Paresh");
		q.add("Gouri");
		q.add("Madhavi");
		q.add("Darshan");
		q.add("Priti");

		q.offer("Sonam");
		print();
	}

	// display/print/read records
	private static void print() {
		// System.out.println(q);

//		for (String name : q) {
//			System.out.print(name + " ");
//		}
//		
//		System.out.println();

		Iterator iterator = q.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
	}

	private static void remove() {

		while (q.size() > 0) {
			q.remove();
			//q.poll();
			print();
		}

	}

	public static void main(String[] args) {

		// create
		addToQueue();

		q.peek(); // gives the first element from the queue
		// remove
		remove();
	}

}
