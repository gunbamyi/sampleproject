package com.javaex;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;
	
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void rent(int bookNo) {
		this.stateCode = 0;
		System.out.println(this.title + " ��(��) �뿩 ���Դϴ�.");
		}
	public void print()  {
		// ����� ���� ����
		String temp = this.bookNo + " å���� : " +this.title +" ���� : " 
			       + this.author;
		if(this.stateCode ==1)  {
			System.out.println(temp+"  �������");
		} else {
			System.out.println(temp+"  �뿩 ��");
		}
	}
	// �� ��ü��  StateCode�� ������� �뿩������ ���������
	//  rent()  ȣ��� StateCode�� 0���� �����Ѵ�
	
	//	BookŬ������ stateCode�� 0���� �����ϸ�  ��_______��(��) �뿩 �ƽ��ϴ�.�� �޽����� 
	//  ��µǵ��� �ۼ��մϴ�. �̶� ______�� å������ ��µǵ��� �ۼ��մϴ�.

	/**
	 * @param bookNo
	 * @param title
	 * @param author
	 * @param stateCode
	 */
	public Book(int bookNo, String title, String author, int stateCode) {
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = stateCode;
	}
	public void showInfo() {
		System.out.println(bookNo + " å����: "+title +" ���� : " + author + "�뿩���� : "+stateCode);
	}

}
