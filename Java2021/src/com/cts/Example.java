package com.cts;

import static java.lang.Math.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) throws Exception {

		Integer a=200;
		
		Integer b=20;
		
		System.out.println(a.compareTo(b));
		
		
	    
		List<Employee> list=new ArrayList<Employee>();
		
		list.add(new Employee(500,"def",50000)); // 1 1.compareTo(2)
		list.add(new Employee(300,"mno",60000)); // 2 2.compareTo(3)
		list.add(new Employee(200,"abd",55000)); //3  3.compareTo(4)
		list.add(new Employee(100,"pqr",54000)); //4
		
		
		Collections.sort(list);
		
		System.out.println(list);
		
		
		
	}
	
	
}



