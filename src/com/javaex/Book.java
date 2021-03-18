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
		System.out.println(this.title + " 이(가) 대여 중입니다.");
		}
	public void print()  {
		// 출력할 공통 내용
		String temp = this.bookNo + " 책제목 : " +this.title +" 저자 : " 
			       + this.author;
		if(this.stateCode ==1)  {
			System.out.println(temp+"  재고있음");
		} else {
			System.out.println(temp+"  대여 중");
		}
	}
	// 이 개체의  StateCode를 재고있음 대여중으로 사용함으로
	//  rent()  호출시 StateCode를 0으로 변경한다
	
	//	Book클래스의 stateCode를 0으로 변경하며  “_______이(가) 대여 됐습니다.” 메시지가 
	//  출력되도록 작성합니다. 이때 ______는 책제목이 출력되도록 작성합니다.

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
		System.out.println(bookNo + " 책제목: "+title +" 저자 : " + author + "대여유무 : "+stateCode);
	}

}
