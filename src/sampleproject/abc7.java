package sampleproject;

import java.util.Scanner;

public class abc7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int num = sc.nextInt();
		
		for(int i=1; i<=20 ; i++){  //���η� 1���� �Է��� ������ �ݺ�
			for(int j=1 ; j<=5 ; j++){  //���η� ���� ���μ��� ���� ���μ��� ���� �ݺ�
				System.out.print(j);
			}
			System.out.println("num");
		}
		
		
		
		sc.close();
	}

}
