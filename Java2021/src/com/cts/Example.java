package com.cts;

import static java.lang.Math.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Example {

	public static void main(String[] args) throws Exception {

		Atm atm=new Atm() {

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
			
		};
		
		letc(atm);
		
	
		
	}
	
	
	public static void letc(Atm atm) {
		
		atm.atmDeposit(10000);
		
		atm.atmWithdraw(2000);
	}
	
	
}



