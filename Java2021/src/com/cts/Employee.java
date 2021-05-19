package com.cts;

public class Employee  extends Object implements Comparable<Employee>{

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
	 
		return this.name.compareTo(o.name);
		
	}
	
	public int hashCode() {
				
		
		
		
		System.out.println(this.id+" hashcode called ");
		
		return this.id;
		
	}
	
	
	public boolean equals(Object o) {
		System.out.println("equals called");
		Employee emp=(Employee)o;
		
		return this.id==emp.id && this.name.equals(emp.name);
	}
	
}

