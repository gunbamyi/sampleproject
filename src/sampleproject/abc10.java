package sampleproject;

import java.util.Scanner;

public class abc10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int n = sc.nextInt();
		
		for(int i=1; i<=n ; i++){  //���η� 1���� �Է��� ������ �ݺ�
			for(int j=0; j<i ; j++){  //���η� ���� ���μ��� ���� ���μ��� ���� �ݺ�
				System.out.print(i);
			}
			System.out.println("\t");
		}
		
		
		
		sc.close();
		

	}

}
