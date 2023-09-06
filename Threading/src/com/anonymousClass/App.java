package com.anonymousClass;

// Runnable
class MyThread implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(500);
				System.out.println(Thread.currentThread().getName() + " thread is running");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class App {

	public static void main(String[] args) {
		System.out.println("Application started");

//		MyThread t1 = new MyThread();
//		Thread t = new Thread(t1);
//		t.start();

		

		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(500);
				System.out.println(Thread.currentThread().getName() + " thread is running");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("Application ended");
	}

}
