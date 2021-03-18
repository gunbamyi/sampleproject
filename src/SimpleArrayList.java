
public class SimpleArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleArrayList list = new SimpleArrayList();
		
		list.add(50);
		list.add(100);
		
		Integer value1 = (Integer) list.get(0);
		Integer value2 = (Integer) list.get(1);
		
		System.out.println(value1+value2);

	}

}
