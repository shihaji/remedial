package com.cts;

public abstract class Bank {
	
	int balance;
	
	
	public void doDeposit(int amount) {
		this.balance+=amount;
		
		System.out.println("After deposit "+this.balance);
	}

	
	public void doWithdraw(int amount) {
		this.balance-=amount;
		
		System.out.println("After withdrawal "+this.balance);
	}
	
	public abstract void calculateDeposit();
			
	
}





