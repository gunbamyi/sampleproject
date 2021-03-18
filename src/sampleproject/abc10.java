package sampleproject;

import java.util.Scanner;

public class abc10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int n = sc.nextInt();
		
		for(int i=1; i<=n ; i++){  //세로로 1부터 입력한 값까지 반복
			for(int j=0; j<i ; j++){  //가로로 현재 세로숫자 부터 세로숫자 까지 반복
				System.out.print(i);
			}
			System.out.println("\t");
		}
		
		
		
		sc.close();
		

	}

}
