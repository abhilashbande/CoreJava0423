package com.oops.inheritance.overriding;

public class HDFC extends Bank {
	
	public HDFC(String accountNo) {
		super(accountNo);
	}

	@Override
	public String toString() {
		return "HDFC [Balance=" + getBalance() + ", Rate Of Interest=" + getRateOfInterest() + ", Account No()="
				+ getAccountNo() + "]";
	}
	
	//  method overriding
	public double calculateSimpleInterest(double amount, double tenure) {
		System.out.println("SI using HDFC (Child) class");
		return (amount * tenure * 6.5) / 100.0; // pnr / 100
	}

}
