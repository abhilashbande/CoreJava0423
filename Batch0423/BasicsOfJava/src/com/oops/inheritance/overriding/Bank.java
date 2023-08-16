package com.oops.inheritance.overriding;

public class Bank {
	private String accountNo;
//	private double rateOfInterest;
	private double balance;

	public Bank(String accountNo) {
		super();
		this.accountNo = accountNo;
//		this.rateOfInterest = 7.5;
		this.balance = 0.0;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	  public double getRateOfInterest() { return 7.5; }
	  
//	  public void setRateOfInterest(double rateOfInterest) { this.rateOfInterest =
//	  rateOfInterest; }
	 

	public String getAccountNo() {
		return accountNo;
	}

	public double calculateSimpleInterest(double amount, double tenure) {
		System.out.println("SI using Bank (Parent) class");
		return (amount * tenure * 7.5) / 100.0; // pnr / 100
	}

}
