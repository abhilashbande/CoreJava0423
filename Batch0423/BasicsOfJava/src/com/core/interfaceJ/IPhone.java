package com.core.interfaceJ;

public class IPhone implements IMobile {

	@Override
	public String ram() {
		return "16GB";
	}

	@Override
	public String internalStorage() {
		return "128GB";
	}

	@Override
	public String brand() {
		return "Apple";
	}

	@Override
	public String modelNumber() {
		return "IPhone 14 Pro Max";
	}

	@Override
	public String camera() {
		// TODO Auto-generated method stub
		return null;
	}

}
