package sampleproject;

import java.util.Scanner;

public class abc2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڹ��Ľù߾�?");
		int num = sc.nextInt();
		
		if(num > 0) {
			
			if( num % 2 == 0) {
				System.out.println("¦�� �Դϴ�");
			}else if( num == 0) {
				System.out.println("0");
			}else if(num < 0) {
				System.out.println("���� �Դϴ�");
			}else {
				System.out.println("Ȧ�� �Դϴ�");
			}
		
		}
		
		
	}

}
