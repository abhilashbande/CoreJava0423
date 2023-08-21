package com.oops.inheritance.abstractI;

// abstract class 
public abstract class Shape {
	private double area;

	// method which has no definition
	abstract public double area();

	public Shape() {
		super();
		this.area = 0.0;
	}

	public Shape(int area) {
		super();
		this.area = area;
	}

	public double getArea() {
		return area;
	}

	// concrete method
	public void setArea(double area) {
		this.area = area;
	}

}
