package com.javaex;

public class ColorPoint extends Point  {
	
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @param x
	 * @param y
	 * @param color
	 */
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public ColorPoint(String color) {
		// TODO Auto-generated constructor stub
		this.color = color;
	}
    
	public void showInfo() {
		System.out.println();
	
	}
	

	

}
