package sampleproject;

import java.util.Scanner;

public class abc9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		int n, sum=0;
		do {
			n = sc.nextInt();
			sum += n;
			System.out.println("�հ� : " + sum);
		}while(n != 0);
						
	}

}
