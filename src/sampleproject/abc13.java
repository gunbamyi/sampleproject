package sampleproject;

import java.util.Scanner;

public class abc13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int bank=0;
		
		while(true) {
			System.out.println("1.���� | 2.Ǯ�� | 3.�ܰ� | 4.���� ");
			
			System.out.print("����>");
			int i=sc.nextInt();
			
			if(i==1) {
				System.out.print("���ݾ�>");
				int m = sc.nextInt();
				bank = bank+m;
			}if(i==2) {
				System.out.print("��ݾ�>");
				int m = sc.nextInt();
				if(bank<m) {
					System.out.println("�ܾ� ����.");
				}else {
					bank = bank-m;
				}
			}else if(i==3) {
				System.out.println("�ܰ��>"+bank);
			}else if(i>4) {
				System.out.println("�ٽ� �Է��ϼ���.");
			}else if(i==4) {
				System.out.println("���α׷� ����");
				break;
			}
			
			sc.nextLine();
		}
		sc.close();
		

	}

}
