package sampleproject;

import java.util.Scanner;

public class abc4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		System.out.println("���� �Է��ϼ���");		
		
		int n = scanner.nextInt();
		
		switch(n) {
			case 1 :case 3 :case 5 :case 7 :case 8 :case 10 :case 12 :
				System.out.println("31�� �Դϴ�.");
				break;
			case 2 :
				System.out.println("28�� �Դϴ�.");
				break;
			case 4 :case 6 :case 9 :case 11 :
				System.out.println("30�� �Դϴ�.");
				break;		
		}
		scanner.close();
	}

}
