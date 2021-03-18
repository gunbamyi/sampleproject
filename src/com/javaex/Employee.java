package com.javaex;

public class Employee {
	private String name;
	private int salary;
	
	public Employee()  {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	/**
	 * @param name
	 * @param salary
	 */
	Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	

	public Employee(String string, int i, String string2) {
		// TODO Auto-generated constructor stub
	}
	public void getInformation()  {
		System.out.println("¿Ã∏ß :"+name+"ø¨∫¿ :"+salary);
	}
	
}

