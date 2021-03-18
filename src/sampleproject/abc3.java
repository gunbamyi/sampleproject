package sampleproject;

import java.util.Scanner;

public class abc3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("과목을 선택하세요.");
		System.out.print("과목번호");
		
		int n = scanner.nextInt();
		switch(n) {
			case 1 :
				System.out.println("101호 입니다.");
				break;
			case 2 :
				System.out.println("102호 입니다.");
				break;
			case 3 :
				System.out.println("103호 입니다.");
				break;
			case 4 :
				System.out.println("104호 입니다.");
				break;
			default :
				System.out.println("문의.");
				break;
		}
		scanner.close();
	}

}
