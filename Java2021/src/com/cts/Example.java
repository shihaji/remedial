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
import java.util.Set;
import java.util.TreeSet;

public class Example {

	public static void main(String[] args) throws Exception {

		
		Set<Employee> set=new HashSet<Employee>();
		
		Employee emp=new Employee(900,"xyz",55000);  //1001
		
		Employee emp1=emp;   //1001
		
		set.add(emp);
		
		set.add(emp1);
		set.add(new Employee(100,"abc",25000)); //1002
		
		set.add(new Employee(100,"abc",25000)); // 1003
		
		set.add(new Employee(200,"def",25000)); // 1004
		
		set.add(new Employee(300,"mno",25000)); // 1005
		
		System.out.println(set);
		
		// first hashcode
		// ==
		// equals 
		
		
		
		
		
		
	
		
		
		
		
		
	}
	
	
}



