package com.cts;

import static java.lang.Math.*;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) throws Exception {

		try {
		checkAge(20);
	
		}catch(AgeException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void checkAge(int age) throws AgeException {
		
		if(age<18) {
			throw new AgeException("minor");
		}else {
			System.out.println("eligible to vote");
		}
		
		
	}

	

}
