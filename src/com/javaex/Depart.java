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
		System.out.println("�̸� :"+super.getName()+
				         "  ���� :"+super.getSalary()+
				         "  �μ� :"+this.dePart);
	}
	

}
