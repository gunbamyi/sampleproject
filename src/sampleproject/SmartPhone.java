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
		System.out.println("������ �������ϴ�.");
	}

	public void turnOFF(boolean OFF) {
		System.out.println("������ �������ϴ�.");
	}
	public void searchInternet(String url)  {
		System.out.println(this.getUrl());
	}

	public void call(String num)  {
		System.out.println("����ȣ"+this.getNumber()+" ���� ��ȣ��"+num+" �Դϴ�.");
	}

	public void turnon() {
		System.out.println();
	}

	
	}
	

