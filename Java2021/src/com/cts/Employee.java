package com.cts;

public class Employee  implements Comparable<Employee>{

	int id;
	String name;
	int salary;

	public Employee() {

	}
	
	

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}



	public void work() {

		System.out.println(this.id + " works for " + this.salary);
	}

	public String toString() {
		return id + "  " + name + "   " + salary;
	}



	@Override
	public int compareTo(Employee o) {
	 
		if(this.id>o.id) {
			return 1;
		}else {
			return -1;
		}
		
		
	}
	
	
}

