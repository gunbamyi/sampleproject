package sampleproject;

public class ShapeApp {

    public static void main(String[] args) {
  //    Circle c = new Circle();
  //    c.setRadius(10);
  //    System.out.println("�������� " + c.getRadius() 
  //                       + "�� ���� ������ " +  c.area() );
      
      Rectangle d = new Rectangle(0, 0);
      d.setWidth(4);
      d.setHeight(5);
      System.out.println("(����,����) (" 
                         + d.getWidth() + "," + d.getHeight()
                         + ") �簢���� ������ " +  d.area() );
      Rectangle a = new Rectangle(6,4);
	  Rectangle b = new Rectangle(2,12);
	  Rectangle k = new Rectangle(3,3);
	  Rectangle m = k;
	  System.out.println(a.equals(b));
	  System.out.println(a.equals(k));
	  System.out.println(a.equals(m));
	  System.out.println(m.equals(k));
		}

	

    
  //    Triangle t = new Triangle();
 //     t.setWidth(4);
  //    t.setHeight(5);
  //    System.out.println("(�غ�,������) (" 
  //                       + t.getWidth() + "," + t.getHeight()
  //                       + ") �ﰢ���� ������ " +  t.area() );
    
    }

