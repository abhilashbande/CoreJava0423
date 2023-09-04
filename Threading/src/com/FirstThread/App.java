package com.FirstThread;

//class Printer  {

// 	PT5.0919985S
//	private String name;
//	
//	public void run() {
//		for (int i = 1; i <= 5; i++) {
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			System.out.println("Name : " + name + " \t i : " + i);
//		}
//		System.out.println();
//	}
//
//	public Printer(String name) {
//		super();
//		this.name = name;
//	}
//}

//2 ways to create threads
//1. extending Thread class

//class Printer extends Thread {
//	private String name;
//
//	@Override
//	public void run() {
//		for (int i = 1; i <= 5; i++) {
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println("Name : " + name + " \t i : " + i);
//		}
//		System.out.println();
//	}
//
//	public Printer(String name) {
//		super();
//		this.name = name;
//	}
//}

//2. implementing Runnable interface
class Printer implements Runnable {
	private String name;

	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Name : " + name + " \t i : " + i);
		}
		System.out.println();
	}

	public Printer(String name) {
		super();
		this.name = name;
	}
}

public class App {

	// sequential programming
	// parallel programming

	// multiprocessing
	// multithreading

	// user defined thread (main is an user defined)
	public static void main(String[] args) throws InterruptedException {
		System.out.println("**** Application started **** ");

		Printer p1 = new Printer("P1");
		Thread t1 = new Thread(p1);
		t1.start();
//		// System.out.println("Line no 62 : " + p1.getState());
//		p1.start();
//		// System.out.println("Line no 64 : " + p1.getState());

		Printer p2 = new Printer("P2");
//		p2.start();
		Thread t2 = new Thread(p2);
		t2.start();

		System.out.println("**** Application ended **** ");
		// System.out.println("Line no 70 : " + p1.getState());
		// NEW
		// Runnable
		// Blocked
		// Terminated

	}

}
