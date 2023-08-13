package com.oops.inheritance.abstractI;

public class Circle extends Shape {

	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double area() {
		return 2 * Math.PI * radius;
	}

}
