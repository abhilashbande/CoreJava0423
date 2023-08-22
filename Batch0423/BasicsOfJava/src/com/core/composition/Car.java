package com.core.composition;

// composition -> has a relation
// inheritance -> is a relation


public class Car {

	// doors
	Door d;

	// tyres
	Tyre t;

	public Car(Door d, Tyre t) {
		super();
		d = new Door("", "", 0);
		t = new Tyre(0);
		this.d = d;
		this.t = t;
	}

	public Car(float tyreSize, String doorColor, String doorMaterial, double doorSize) {
		super();
		d = new Door(doorColor, doorMaterial, doorSize);
		t = new Tyre(tyreSize);
	
	}

	public String getDoorColor() {
		return this.d.getColor();
	}

	public Door getD() {
		return d;
	}

	public void setD(Door d) {
		this.d = d;
	}

	public Tyre getT() {
		return t;
	}

	public void setT(Tyre t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return "Car [d=" + d + ", t=" + t + "]";
	}

	

}
