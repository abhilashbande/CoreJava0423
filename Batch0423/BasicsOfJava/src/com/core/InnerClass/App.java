package com.core.InnerClass;

public class App {

	public static void main(String[] args) {
		Car car = new Car(18, "Black");
		Car.Tyre t = car.getTyre();
		
		System.out.println("Color :" + t.getColor());
		System.out.println("Size :" + t.getSize());
		System.out.println(car);
		

	}

}
