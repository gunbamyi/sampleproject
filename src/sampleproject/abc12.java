package sampleproject;

import java.util.Scanner;

public class abc12 {

	public static void main(String[] args) {
		int i = 0;
		Scanner sc = new Scanner(System.in);
		
		while (true){
		String ac;
		
		System.out.println("0 ~ 100 사이의 난수 1개 발생 ");
		
		int n = (int) (Math.random() * 100) ;
		
		
		
		do {
			System.out.print("1과 100사이의 값을 입력하세요 : ");
			i =sc.nextInt();
			if(n>i) {
				System.out.println("더 높은수.");
			}else if(n<i) {
				System.out.println("더 낮은수.");
			}else {
				System.out.println("맞췄다.");
				break;
			}
		}
		while (true);
		
		sc.nextLine();
		
		System.out.print("(y/n) >>");
		ac = sc.next();
		if("y".equals(ac)) {
			System.out.println("끝.");
			break;
		}
			
		}
			sc.close();
	
	}
	

}
