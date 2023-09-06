package com.DaemonT;

class MyThread extends Thread {
	private String name;

	public MyThread(String name) {
		super(name);
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i =1; i< 5; i++) {
			try {
				System.out.println(currentThread().getName() + " thread is running...");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(currentThread().getName() + " finished its execution");
	}
	
	
}

public class App {

	// daemon thread
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main started");
		MyThread t1 = new MyThread("Thread 1");
		MyThread t2 = new MyThread("Thread 2");
		
		//t1.setDaemon(true);
		//t2.setDaemon(false);
		
		t1.start();
		t2.start();
		
		
		Thread.sleep(1000);
		System.out.println("Main ended");

	}

}
