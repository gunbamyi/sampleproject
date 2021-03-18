package sampleproject;

public class OpTest {

	public static void main(String[] args) {
		// 나이(int age)가 20대인 경우
		int age = 29;
		boolean b = (age >= 20) && (age > 30);
		System.out.println(b);
		
		// 문자(char c)가 대문자인 경우
		char c = 'a';
		b = (c >= 65) && (c <= 90);
		System.out.println(b);
		

	}

}
