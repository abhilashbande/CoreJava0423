package com.core.interfaceJ;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OnePlus o = new OnePlus();
		System.out.println(o.brand());
		System.out.println(o.modelNumber());

		IPhone a = new IPhone();
		System.out.println(a.brand());
		System.out.println(a.modelNumber());
	}

}
