package com.oops.inheritance.abstract3;

public abstract class Ant extends Animal {

	public abstract void speak();
	public abstract void eat();
	public abstract void sing();
	
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Ant is walking...");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Ant is running...");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Ant is sleeping...");
	}
	
}
