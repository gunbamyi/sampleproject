package sampleproject;

public class Point {
	private int x;
	private int y;
	
	public Point() {}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	public void draw() {
		System.out.println("점[x=" + this.x +", y= " + this.y + "]을 그렸습니다.");
	}
	public void draw(int a) {
		System.out.println("점[x=" + this.x +", y= " + this.y + "]을 지웠습니다.");
	}

}
