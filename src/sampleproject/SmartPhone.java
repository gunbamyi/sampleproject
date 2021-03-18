package sampleproject;

public class SmartPhone extends Phone {
	String number;
	String url;
	
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @param number
	 * @param url
	 */
	public SmartPhone(String number, String url) {
		super();
		this.number = number;
		this.url = url;
	}

	public void turnOn(boolean ON) {
		System.out.println("전원이 켜졌습니다.");
	}

	public void turnOFF(boolean OFF) {
		System.out.println("전원이 꺼졌습니다.");
	}
	public void searchInternet(String url)  {
		System.out.println(this.getUrl());
	}

	public void call(String num)  {
		System.out.println("내번호"+this.getNumber()+" 상대방 번호는"+num+" 입니다.");
	}

	public void turnon() {
		System.out.println();
	}

	
	}
	

