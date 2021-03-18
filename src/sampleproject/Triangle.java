package sampleproject;

public class Triangle extends Shape {
	  private int width;
	  private int height;
	  
	  public int getWidth() {
	    return width;
	  }
	  public void setWidth(int width) {
	    this.width = width;
	  }
	  public int getHeight() {
	    return height;
	  }
	  public void setHeight(int height) {
	    this.height = height;
	  }
	  
	  public double area() {
	    double d = this.width * this.height / 2 ;
	    return d;
	  }
	}