package sampleproject;

import java.util.Scanner;

public class abc1 {

	public static void main(String[] args) {
		System.out.println("이름을 입력하시오.");
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		System.out.print("이름은 " + name + " 입니다.");
		
		sc.close();

	}

}
