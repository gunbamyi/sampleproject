package sampleproject;

import java.util.Scanner;

public class IuputnumberEven {

	public static void main(String[] args) {
		int num=0, sum = 0;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("������ �Է��ϼ��� ������ �Է� -1 ��... ");
	    
	    int count = 0;      // �Է��� �������� ����
	    
	    while(num != -1) {
	      num = sc.nextInt();
	      if(num %2 == 0) {
	        sum += num;
	        if(count != 0) {
	          System.out.print(" + " + num);
	        }else {
	          System.out.print( num);
	        }
	        count++;
	      }
	    }
	      
	    System.out.println(" = " + sum);
	    sc.close();

	}

}
