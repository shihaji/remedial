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
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Example {

	public static void main(String[] args) throws Exception {

		Account account=new Account();
		
		Thread husband=new Thread(account);
		husband.setName("husband");
		
		Thread wife=new Thread(account);
		wife.setName("wife");
		
		husband.start();
		wife.start();
		
		
				
	}
	
		
}


class Account implements Runnable{
	
	int balance=5000;   // instance variable not thread safe
	
	public  void checkBalance() {
		
		System.out.println("Balance before withdrawal "+Thread.currentThread().getName()+" is "+this.balance);
	}
	
	public  void withdraw() {
		int bal=0;     // local variable is thread safe as they have a local copy
		System.out.println("local variable "+bal);
		bal=this.balance-5000;  //wife first
		this.balance=bal;
		System.out.println("Balance after withdrawal "+Thread.currentThread().getName()+" is "+this.balance);

	}
	
	public void run() {
		
		synchronized (this) {
			checkBalance();
			
			withdraw();
		}
		
		
		
	}
	
	
}
