package sampleproject;

public class PhoneApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("유선전화");
		System.out.println("--------------------------------------");
		
		TelePhone te = new TelePhone("02-852-5245");
		te.call("010-5555-5555");
		te.power(true);
		te.power(false);
		
		System.out.println("======================================");
		
		System.out.println("스마트폰");
		
		SmartPhone sm = new SmartPhone("010-7777-7777","www.naver.com");
		sm.call("010-4445-5518");
		sm.searchInternet("www.myhome.co.kr");
		sm.turnOn(true);
		sm.turnOFF(false);
	}

}
