package sampleproject;

public class Hello {

	public static int sum(int n, int m) {
		return n + m;
	}
	public static void main(String[] args) {
		int i = 20; // ������ ���� i ���� �� ����
		int s;
		char a;
		
		s = sum(i, 10);
		a = '?';
		
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s + " Hello");
		
		int n = 15;
		int m = 015;
		int k = 0x15;
		int b = 0b0101;
		System.out.println(n);
		System.out.println(m);
		System.out.println(k);
		System.out.println(b);
		
	}

}
