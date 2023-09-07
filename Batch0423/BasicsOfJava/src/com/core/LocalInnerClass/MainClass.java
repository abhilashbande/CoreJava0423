package com.core.LocalInnerClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Door d = new Door();
		if (d.isLocked("normal user")) {
			System.out.println("Door is locked");
		} else {
			System.out.println("Door is open");
		}

	}

}
