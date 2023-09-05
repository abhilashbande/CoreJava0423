package com.SecondThread;

class Counter extends Thread {
	private String name;
	private static int counter;

	static {
		counter = 0;
	}

	public Counter(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		increment();
	}

	private void increment() {
		for (int i = 1; i <= 100; i++) {
			try {
				Thread.sleep(10);
				counter++;
				System.out.println("Thread : " + name + "\tcounter : " + counter);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("@@@ Thread " + name + " has finished its execution @@@");
	}

	public static int getCounter() {
		return counter;
	}
}

public class App {

	public static void main(String[] args) throws InterruptedException {
		// task 1
		System.out.println("**** Application started ****");

		// task 2
		Counter c1 = new Counter("1");

		// task 3
		c1.start();

		// task 4
		Counter c2 = new Counter("2");

		// task 5
		c2.start();
		
		Counter c3 = new Counter("3");
		c3.start();
		

		c1.join();
		c2.join();
		c3.join();

		// task 6
		System.out.println("Counter value is : " + Counter.getCounter());
		Thread.sleep(1000);
		// task 7
		System.out.println("**** Application ended ****");
	}

}
