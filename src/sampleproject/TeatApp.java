package sampleproject;

public class TeatApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point();
		Point p1 = new Point(5,5);
		Point p2 = new Point(10,23);
		
		p1.draw();
		p2.draw();
		p.draw();
		p2.draw(1);

	}

}
