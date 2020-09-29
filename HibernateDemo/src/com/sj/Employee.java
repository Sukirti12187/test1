package com.sj;

public class Employee {
	
	public int id,sal;
	public String name;
	
	public Employee()
	{
		
	}
	public Employee(int id, String name, int sal) 
	{
		this.id = id;
		this.sal = sal;
		this.name = name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		System.out.println("Called");
		this.name = name;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getSal() {
		return sal;
	}
	
	
	public String toString() {
		return "Employee [id=" + id + ", sal=" + sal + ", name=" + name + "]";
	}
	

	
}