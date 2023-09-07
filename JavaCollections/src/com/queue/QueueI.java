package com.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class QueueI {

	//static PriorityQueue<String> q = new PriorityQueue<String>();
	static PriorityBlockingQueue<Integer> q = new PriorityBlockingQueue<Integer>();

	// create/add records
	private static void addToQueue() {
//		q.add("Prashant");
//		q.add("Paresh");
//		q.add("Gouri");
//		q.add("Madhavi");
//		q.add("Darshan");
//		q.add("Priti");
//
		
		
//		q.offer("Sonam");
		q.add(10);
		q.add(25);
		q.add(1);
		q.add(98);
		q.add(45);
		q.add(87);
		print();
	}

	// display/print/read records
	private static void print() {
		 System.out.println(q);

//		for (String name : q) {
//			System.out.print(name + " ");
//		}
//		
//		System.out.println();

//		Iterator iterator = q.iterator();
//		while (iterator.hasNext()) {
//			System.out.print(iterator.next() + " ");
//		}
//		System.out.println();
	}

	private static void remove() {

		while (q.size() > 0) {
			System.out.println("Removed : " + q.remove());
			//q.poll();
			//print();
		}

	}

	public static void main(String[] args) {

		// create
		addToQueue();

		//System.out.println("Peek : " + q.peek()); // gives the first element from the queue
		// remove
		remove();
	}

}
