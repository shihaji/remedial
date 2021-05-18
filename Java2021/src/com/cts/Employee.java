package com.cts;

public class Employee extends Object {

	int id;
	String name;
	int salary;

	public Employee() {

	}

	public void work() {

		System.out.println(this.id + " works for " + this.salary);
	}

	public String toString() {
		return id + "  " + name + "   " + salary;
	}
	
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		return this.id == e.id && e.name.equals(this.name);

	}

}

// super = calls the super class method, used in overridden method , no need to be first statement

// super()= calls the super class constructor, used in constructor as first statement
