package com.Sync;

// synchronization

// 1. synchronized methods
// 2. synchronized blocks
// 3. synchronized static methods

class Printer {
	public synchronized void printDocuments(int numberOfPages, String documentName) {
//		synchronized (this) {
			for (int i = 1; i <= numberOfPages; i++) {
				try {
					System.out.println("Name of the thread is :: " + Thread.currentThread().getName());
					System.out.println("Printing " + documentName + "\tPageNo#" + i);
					Thread.sleep(500);
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
//		}
	}
}

class Rajat extends Thread {
	private String name;
	private Printer pRef;

	public Rajat(Printer p, String name) {
		super();
		pRef = p;
		this.name = name;

	}

	@Override
	public void run() {
		pRef.printDocuments(5, name);
	}
}

class Nidhi extends Thread {
	private String name;
	private Printer pRef;

	public Nidhi(Printer p, String name) {
		super();
		pRef = p;
		this.name = name;
	}

	@Override
	public void run() {
		pRef.printDocuments(5, name);
	}
}

public class App {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(" **** Application started ****");
		Printer p = new Printer();
		Rajat rajat = new Rajat(p, "Rajat");
		
		Nidhi nidhi = new Nidhi(p, "Nidhi");
		
		//Rajat cv = new Rajat(p, "Rajat's CV");
		
		//Nidhi notes = new Nidhi(p, "Nidhi's Java Notes");
		
		rajat.start();
		nidhi.start();
		//cv.start();
		//notes.start();
		
		rajat.join();
		nidhi.join();
		
		System.out.println(" **** Application ended ****");		
	}

}
