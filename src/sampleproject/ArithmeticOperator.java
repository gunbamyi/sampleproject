package sampleproject;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��(����)�� �Է��ϼ���:");
		
		long time = sc.nextLong();
		long second = time % 60;
		long minute = (time / 60) % 60;
		long hour = (time / 60) / 60;
		
		System.out.print(time + "�ʴ� ");
		System.out.print(hour + "�ð�, ");
		System.out.print(minute + "��, ");
		System.out.print(second + "�� �Դϴ�. ");
		
		sc.close();

	}

}
