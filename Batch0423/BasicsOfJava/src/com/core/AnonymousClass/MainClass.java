package com.core.AnonymousClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(10);
		System.out.println(c1.getS().area());
		System.out.println(new Circle(20).getS().area());
		System.out.println(new Circle(30).getS().area());
	}

}
