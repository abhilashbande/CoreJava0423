package com.core.extra;

public class Child2 extends Parent {
	public void child2Method() {
		System.out.println("child2 method...");
	}
	
	public void child2AnotherMethod() {
		System.out.println("child2 method...");
	}
	
	@Override
	public void parentMethod() {
		System.out.println("parent method from Child2 class");
	}
}
