package com.javaex;

public class Goods {
	private String Name;
	private int Price;

     		
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public Goods(String name, int price) {
		super();
		this.Name = name;
		this.Price = price;
	}public void showInfo() {
		System.out.println(" 제품 : " + this.Name);
		System.out.println(" 가격 : " + this.Price);

	}


	}


