package com.javaex;
import java.util.Scanner;
public class FriendApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Friend[] sArr = new Friend[3];
		Scanner sc = new Scanner(System.in);
        System.out.println("ģ���� 3�� ����� �ּ���");
            // ģ������ �Է¹ޱ�
            // �Է¹��� ģ�������� �������� �и�
            // Friend ��ü �����Ͽ� ������ �ֱ�
            // �迭�� �߰��ϱ�
        // ģ������ ���
        
               
        for (int i = 0; i < sArr.length; i++) {
            //ģ������ ��� �޼ҵ� ȣ��
        	String temp = sc.nextLine();
        	String[] tempArr = temp.split(" ");
        	sArr[i] = new Friend(tempArr[0],tempArr[1],tempArr[2]);
       }
        for( int i=0; i< sArr.length; i++) {
        	sArr[i].showInfo();
        }
         sc.close();
	}



	}


