package com.core.interfaceJ;

public class OnePlus implements IMobile {

	@Override
	public String ram() {
		return "8GB";
	}

	@Override
	public String internalStorage() {
		return "64GB";
	}

	@Override
	public String brand() {
		return "OnePlus";
	}

	@Override
	public String modelNumber() {
		return "10T Pro";
	}

	@Override
	public String camera() {
		return "";
	}

}
