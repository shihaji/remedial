package com.cts;

public class Axis implements Atm{

	int balance;
	
	@Override
	public void atmDeposit(int amount) {
		this.balance+=amount;
		System.out.println(this.balance);
		
	}

	@Override
	public void atmWithdraw(int amount) {
		
		this.balance-=amount;
		System.out.println(this.balance);
		
	}
	
	

}
