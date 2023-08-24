package com.core.AnonymousClass;

public class Circle {
	private double radius;
	
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	Shape s = new Shape() {
		@Override
		public double area() {
			// TODO Auto-generated method stub
			return 2 * Math.PI * radius;
		}
	};

	public Shape getS() {
		return s;
	}
	
	

}
