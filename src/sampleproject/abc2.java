package sampleproject;

import java.util.Scanner;

public class abc2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자뭐냐시발아?");
		int num = sc.nextInt();
		
		if(num > 0) {
			
			if( num % 2 == 0) {
				System.out.println("짝수 입니다");
			}else if( num == 0) {
				System.out.println("0");
			}else if(num < 0) {
				System.out.println("음수 입니다");
			}else {
				System.out.println("홀수 입니다");
			}
		
		}
		
		
	}

}
