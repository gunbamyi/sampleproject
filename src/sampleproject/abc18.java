package sampleproject;

import java.util.Scanner;

public class abc18 {

	public static void main(String[] args) {
		
		int[] won = new int[10];
		won[0] = 50000;
		won[1] = 10000;
		won[2] = 5000;
		won[3] = 1000;
		won[4] = 500;
		won[5] = 100;
		won[6] = 50;
		won[7] = 10;
		won[8] = 5;
		won[9] = 1;
		
		int w=0, count=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("금액: ");
		int m = sc.nextInt();
		
		for(int i=0; i<won.length; i++){
				count = m / won[i];
				w = won[i];
				m %= won[i];
				
		
			System.out.println(w + "원:" + count + "개");
        }
        sc.close();
	}

}
