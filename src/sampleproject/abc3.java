package sampleproject;

import java.util.Scanner;

public class abc3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �����ϼ���.");
		System.out.print("�����ȣ");
		
		int n = scanner.nextInt();
		switch(n) {
			case 1 :
				System.out.println("101ȣ �Դϴ�.");
				break;
			case 2 :
				System.out.println("102ȣ �Դϴ�.");
				break;
			case 3 :
				System.out.println("103ȣ �Դϴ�.");
				break;
			case 4 :
				System.out.println("104ȣ �Դϴ�.");
				break;
			default :
				System.out.println("����.");
				break;
		}
		scanner.close();
	}

}
