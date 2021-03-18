package sampleproject;

public class Rectangle extends Shape {
  private int width;
  private int height;
  
  public Rectangle(int i, int j) {
	// TODO Auto-generated constructor stub
}
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
  
  @Override
  public double area() {
    int d = this.width * this.height;
    return d;
  }
  
}
