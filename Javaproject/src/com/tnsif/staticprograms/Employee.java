package com.tnsif.staticprograms;

public class Employee {

	private String  name;

	private  int id;
	static String companyname="TNS";
	
	

	public Employee() {
		super();
	}

	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", companyname=" + companyname + "]";
	}
	
}
