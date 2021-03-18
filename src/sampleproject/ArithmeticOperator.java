package sampleproject;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("초(정수)를 입력하세요:");
		
		long time = sc.nextLong();
		long second = time % 60;
		long minute = (time / 60) % 60;
		long hour = (time / 60) / 60;
		
		System.out.print(time + "초는 ");
		System.out.print(hour + "시간, ");
		System.out.print(minute + "분, ");
		System.out.print(second + "초 입니다. ");
		
		sc.close();

	}

}
