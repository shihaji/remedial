package com.cts;

public interface Atm {

	public static final int a=10;
	
	public void atmDeposit(int amount);
	
	public void atmWithdraw(int amount);
	
	public default void showDetails() {
		System.out.println("details ");
	}
	
	public static void showLoc() {
		
		
	}
	
	
}





// from java 8 onwards interface can have default method and static method
// interface can extend another interface
// interface cannot implement another interface
// class can extend only one class
// class can implement many interfaces
// interface can extend many interfaces
// class should extend keyword  first then only implements keyword




