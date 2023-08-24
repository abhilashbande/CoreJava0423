package com.core.InnerClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Door d = new Door();
		d.status();
		d.getOuterLock().setInnerLock(false);
		
		d.status();
	}

}
