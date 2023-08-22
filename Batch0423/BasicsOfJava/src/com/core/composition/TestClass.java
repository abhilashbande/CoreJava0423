package com.core.composition;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car(18, "red", "metal", 85);
		c1.getD().setColor("yello");
		System.out.println(c1);
	}

}
