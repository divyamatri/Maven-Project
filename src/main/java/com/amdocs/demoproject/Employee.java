package com.amdocs.demoproject;

public class Employee {
	
	private int id;
	private String name;
	private int salary;
	
	
	public int getId(){
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return "Id: " + this.id + "\nName: "+this.name +"\nSalary: "+this.salary;
	}
	
	
}
