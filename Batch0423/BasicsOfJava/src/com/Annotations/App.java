package com.Annotations;

import java.util.ArrayList;

class Parent {
	void ParentMethod() {
		System.out.println("Parent method...");
	}
}

class Child extends Parent {
	@Override
	void ParentMethod() {
		System.out.println("child method...");
	}

	@Deprecated
	public void deprecatedMethod() {
		System.out.println("We are not going to provide support for this method.");
	}
}

public class App {

	@SuppressWarnings({ "unused", "rawtypes" })
	public static void main(String[] args) {
		Child c = new Child();
		c.deprecatedMethod();
		int i = 10;
		int no = 23;
		
		ArrayList list = new ArrayList();

	}

}
