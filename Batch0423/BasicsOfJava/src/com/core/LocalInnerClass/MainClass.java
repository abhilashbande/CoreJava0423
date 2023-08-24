package com.core.LocalInnerClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Door d = new Door();
//		if (d.isLocked("asdf567")) {
//			System.out.println("Door is locked");
//		} else {
//			System.out.println("Door is open");
//		}
		
		Outer o = new Outer();
		System.out.println(o.outerMethod(15));
		
		System.out.println(new Outer().outerMethod(15));
	}

}
