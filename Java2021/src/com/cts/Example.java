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

		MyThread mt=new MyThread();
		
		mt.start();
		
		mt.join();
		System.out.println(mt.total);
		
		
				
	}
	
		
}


class MyThread extends Thread{
	
	int total=100;
	
	public void run() { //here
		System.out.println("second thread");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<10;i++) {
			
			total+=i;
		}
	}
	
}



