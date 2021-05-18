package com.cts;
//                     is a         is a 
public class HdfcBank extends Bank implements Atm {

	@Override
	public void calculateDeposit() {
		
		this.balance+=(this.balance*7)/100;
		
		System.out.println("after interest "+this.balance);

	}

	@Override
	public void atmDeposit(int amount) {
		
             this.balance+=amount;
		
		System.out.println("After deposit "+this.balance);
		
	}

	@Override
	public void atmWithdraw(int amount) {
         this.balance-=amount;
		
		System.out.println("After withdrawal "+this.balance);
		
		
	}

}
