package com.oops;

public class Car {
	private int seatingCapacity;
	private String engine;
	private boolean seatBelt;

	// constructor
	// no return type
	// its name is exactly same as class name
	
	// default constructor
	public Car() {
		seatingCapacity = 4;
		engine = "stopped";
		seatBelt = false;
	}

	public void run() {
		if (engine.equals("started")) {
			System.out.println("Car is running...");
		} else {
			System.out.println("Can't start");
		}
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public boolean isSeatBelt() {
		return seatBelt;
	}

	public void setSeatBelt(boolean seatBelt) {
		this.seatBelt = seatBelt;
	}

}
