package sampleproject;

import java.util.Scanner;

public class abc13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int bank=0;
		
		while(true) {
			System.out.println("1.예금 | 2.풀금 | 3.잔고 | 4.종료 ");
			
			System.out.print("선택>");
			int i=sc.nextInt();
			
			if(i==1) {
				System.out.print("예금액>");
				int m = sc.nextInt();
				bank = bank+m;
			}if(i==2) {
				System.out.print("출금액>");
				int m = sc.nextInt();
				if(bank<m) {
					System.out.println("잔액 부족.");
				}else {
					bank = bank-m;
				}
			}else if(i==3) {
				System.out.println("잔고액>"+bank);
			}else if(i>4) {
				System.out.println("다시 입력하세요.");
			}else if(i==4) {
				System.out.println("프로그램 종료");
				break;
			}
			
			sc.nextLine();
		}
		sc.close();
		

	}

}
