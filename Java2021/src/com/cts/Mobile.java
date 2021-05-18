package com.cts;

public class Mobile extends Telephone {
	
	@Override
    public void makeCall() {
	 // copy the method from super class and paste in subclass and change the 
     // code that is method overriding	 
		System.out.println("press the numbers and call key");
		
	}
	

    public void receiveCall() {
		
		System.out.println("press the call button");
		
	}
	
	
	public void sendMessage() {
		
		System.out.println("message send ");
		
	}

}
