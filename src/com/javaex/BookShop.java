package com.javaex;

import java.util.Scanner;
public class BookShop {
    public static void main(String[] args) {
        Book[] books = new Book[10];
        Scanner sc = new Scanner(System.in);
        books[0] = new Book(1, "Ʈ���϶���", "�����Ĵϸ��̾�",1);
        books[1] = new Book(2, "����", "�����Ĵϸ��̾�",1);
        books[2] = new Book(3, "��Ŭ����", "�����Ĵϸ��̾�",1);
        books[3] = new Book(4, "�극��ŷ��", "�����Ĵϸ��̾�",1);
        books[4] = new Book(5, "�Ƹ���", "������",1);
        books[5] = new Book(6, "�����׵�", "�赿��",1);
        books[6] = new Book(7, "�����ϱ� û���̴�", "�賭��",0);
        books[7] = new Book(8, "��õ", "õ��",1);
        books[8] = new Book(9, "�¹���", "������",1);
        books[9] = new Book(10, "Ǯ�Ͽ콺", "������",1);

        System.out.println("*****���� ���� ����ϱ�******");
        displayBookInfo(books);
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("�뿩 �ϰ� ���� å�� ��ȣ�� �Է��ϼ���:");
        int num = scanner.nextInt();
        scanner.close();
        
        if(num<1 || num>books.length) {
        	System.out.println("�������� �ʴ� å��ȣ �Դϴ�.");
        }
        for(int i=0;i<books.length; i++)  {
        	if(books[i].getBookNo() == num)  {
        		books[i].rent(num);
        	}
        }
        System.out.println("*****���� ���� ����ϱ�******");
        displayBookInfo(books);	
    }
        
    //(2)���޹��� �迭�� ��� ����ϴ� �޼ҵ�
    private static void displayBookInfo(Book[] bo) {
        //�ڵ��ۼ�
       
        for(int i=0;i<bo.length; i++)  {
        	bo[i].print();
        }
	}
       
}