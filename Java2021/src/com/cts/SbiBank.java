package com.cts;

//                   is a          is a 
public class SbiBank extends Bank implements Atm{

	@Override
	public void calculateDeposit() {
		
		this.balance+=(this.balance*5)/100;
		
		System.out.println("after interest "+this.balance);
		
	}

	@Override
	public void atmDeposit(int amount) {
		
		doDeposit(amount);
		
	}

	@Override
	public void atmWithdraw(int amount) {
		
		doWithdraw(amount);
		
	}
	
	

}
