package sampleproject;

import java.util.Scanner;

public class abc7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		for(int i=1; i<=20 ; i++){  //세로로 1부터 입력한 값까지 반복
			for(int j=1 ; j<=5 ; j++){  //가로로 현재 세로숫자 부터 세로숫자 까지 반복
				System.out.print(j);
			}
			System.out.println("num");
		}
		
		
		
		sc.close();
	}

}
