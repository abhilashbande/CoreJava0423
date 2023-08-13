package com.oops.inheritance.abstractI;

// abstract class 
public abstract class Shape {
	private double area;
	
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

	public void setArea(double area) {
		this.area = area;
	}
	
	// method which has no definition
	abstract public double area();
}
