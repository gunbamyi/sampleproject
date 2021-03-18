package com.javaex;

public class Depart extends Employee{

	private String dePart;

	public void setDePart(String dePart) {
		this.dePart = dePart;
	}

	public Depart(String name, int salary, String dePart) {
		super(name,salary);
		this.setDePart(dePart);
	}
	public void getInformation()  {
		System.out.println("이름 :"+super.getName()+
				         "  연봉 :"+super.getSalary()+
				         "  부서 :"+this.dePart);
	}
	

}
