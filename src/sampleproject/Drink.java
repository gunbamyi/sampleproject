package sampleproject;

public class Drink {
	private String name;
	private int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Drink(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public void showInfo() {
		System.out.println("?̸? : " + this.name);
		System.out.println("???? : " + this.price);
	}

}
