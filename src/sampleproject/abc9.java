package sampleproject;

import java.util.Scanner;

public class abc9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int n, sum=0;
		do {
			n = sc.nextInt();
			sum += n;
			System.out.println("합계 : " + sum);
		}while(n != 0);
						
	}

}
