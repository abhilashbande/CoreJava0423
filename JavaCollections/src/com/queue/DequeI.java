package com.queue;

import java.util.*;

public class DequeI {

	static Deque<Integer> q = new ArrayDeque<Integer>();

	private static void addToQueue() {
		q.add(10);
		q.add(2);
		q.add(54);
		q.addFirst(78);
		q.addLast(65);
		q.add(59);

		print();
	}

	private static void print() {
		// System.out.println(q);

		Iterator itr = q.iterator();

		while (itr.hasNext())
			System.out.print(itr.next() + " ");
		System.out.println();
	}

	private static void remove() {
		q.removeFirst();
		print();
		q.removeLast();
		print();
	}

	public static void main(String[] args) {
		// create
		addToQueue();

		// q.peek(); // gives the first element from the queue
		// remove
		 remove();
		 System.out.println("Peek First : " + q.peekFirst());
		 System.out.println("Peek Last : " + q.peekLast());
	}

}
