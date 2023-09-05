package com.Sync;

// synchronization
// 1. synchronized methods
// 2. synchronized blocks
// 3. synchronized static methods

class Printer {
	private String name;
	private int number;

	public Printer(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}

	synchronized public void printTable() {
		System.out.println(name);
		for (int i = 1; i <= 10; i++) {
			System.out.print(i * number + " ");
		}
		System.out.println("\n");
	}
}

class TablePrinter1 extends Thread {
	Printer p;

	public TablePrinter1(Printer p) {
		super();
		this.p = p;
	}

	@Override
	public void run() {
		p.printTable();
	}
	
	
}

class TablePrinter2 extends Thread {
	Printer p;

	public TablePrinter2(Printer p) {
		super();
		this.p = p;
	}

	@Override
	public void run() {
		p.printTable();
	}
	
	
}

public class App {

	public static void main(String[] args) throws InterruptedException {
		Printer p = new Printer("Table of Three", 3);
		TablePrinter1 p1 = new TablePrinter1(p);
		TablePrinter2 p2 = new TablePrinter2(p);
		//TablePrinter p3 = new TablePrinter(new Printer("Table of seven", 7));
		//TablePrinter p4 = new TablePrinter(new Printer("Table of nine", 9));

		p1.start();
		p2.start();
		//p3.start();
		//p4.start();

	}

}
