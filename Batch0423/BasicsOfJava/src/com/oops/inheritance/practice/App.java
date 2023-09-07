package com.oops.inheritance.practice;

class Parent {
	public void parentMethodOne() {
		System.out.println("Method 1 from Parent class");
	}

	public void parentMethodTwo() {
		System.out.println("Method 2 from Parent class");
	}

	public void parentMethodThree() {
		System.out.println("Method 3 from Parent class");
	}
}

class Child extends Parent {
	@Override
	public void parentMethodOne() {
		System.out.println("Overriden Method 1 from Child class");
	}

	public void childMethodOne() {
		System.out.println("Method 1 from Child class");
	}

	public void childMethodTwo() {
		System.out.println("Method 2 from Child class");
	}

	public void childMethodThree() {
		System.out.println("Method 3 from Child class");
	}
}

public class App {

	public static void main(String[] args) {
//		Child child = new Child();
//		
//		child.parentMethodOne();
//		child.parentMethodTwo();
//		child.parentMethodThree();
//		
//		child.childMethodOne();
//		child.childMethodTwo();
//		child.childMethodThree();

		Parent parent = new Child();

		parent.parentMethodOne();
		parent.parentMethodTwo();
		parent.parentMethodThree();

		if (parent instanceof Child) {
			Child c = (Child) parent;
			c.childMethodOne();
			c.childMethodTwo();
			c.childMethodThree();
		}
		else
			System.out.println("Error : Parent is not instance of child");

	}

}
