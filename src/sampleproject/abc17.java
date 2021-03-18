package sampleproject;

import java.util.Scanner;

public class abc17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] dataArray = new int[5];
		int num;
		double sum = 0;
		
		
		for(int i=0; i<dataArray.length; i++) {
			num = sc.nextInt();
			dataArray[i] = num;
		}
		
		for(int i=0; i<dataArray.length; i++) {
			sum += dataArray[i];
			
		}
		
		System.out.println("평균은 " + sum/5.0 + " 입니다");
		
		sc.close();
	}

}
