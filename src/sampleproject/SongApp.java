package sampleproject;

public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song s1 = new Song("������", "������", "Real", "2010", "3�� track", "�̹μ� �۰�");
		Song s2 = new Song("BIGBANG", "������", "Always", "2007", "2�� track", "G-DRAGON �۰�");
		Song s3 = new Song("����Ŀ����Ŀ", "���ɿ���", "����Ŀ����Ŀ1��", "2012", "4�� track", "����� �۰�");
		Song s = new Song("������","������");
		
		s.showInfo();
		s1.showInfo();
		s2.showInfo();
		s3.showInfo();

	}

}
