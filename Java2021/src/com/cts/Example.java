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

		List<Integer> list=new ArrayList<Integer>();
		
		list.add(10);
		list.add(5);
		list.add(10);
		list.add(50);
		list.add(100);
		list.add(25);
		//list.add(102);
		//list.add(53);
		
		
		int k=list.stream()
		
		.filter(t->t%2==0)
		.map(t->t+5)
		.reduce((t,u)-> t+u)
		.get();
		
		System.out.println(k);
		
		
		boolean b=list.stream().allMatch(new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
			
				return t%5==0;
			}
			
		});
		
		System.out.println(b);
		
		
		List<Integer> l1=list.stream().distinct().collect(Collectors.toList());
	
		System.out.println(l1);
		
	}
	
	
	
}



