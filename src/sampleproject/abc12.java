package sampleproject;

import java.util.Scanner;

public class abc12 {

	public static void main(String[] args) {
		int i = 0;
		Scanner sc = new Scanner(System.in);
		
		while (true){
		String ac;
		
		System.out.println("0 ~ 100 ������ ���� 1�� �߻� ");
		
		int n = (int) (Math.random() * 100) ;
		
		
		
		do {
			System.out.print("1�� 100������ ���� �Է��ϼ��� : ");
			i =sc.nextInt();
			if(n>i) {
				System.out.println("�� ������.");
			}else if(n<i) {
				System.out.println("�� ������.");
			}else {
				System.out.println("�����.");
				break;
			}
		}
		while (true);
		
		sc.nextLine();
		
		System.out.print("(y/n) >>");
		ac = sc.next();
		if("y".equals(ac)) {
			System.out.println("��.");
			break;
		}
			
		}
			sc.close();
	
	}
	

}
