package sampleproject;

public class TelePhone extends Phone  {

	private String number;
	
		
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
		/**
	 * @param number
	 */
	public TelePhone(String number) {
		super();
		this.number = number;
	}

	public void power(boolean o)  {
		if(o==true) {
			System.out.println("������ �������ϴ�.");
		}else  {
			System.out.println("������ �������ϴ�.");
		}
	}
		@Override
		public void call(String num) {
			System.out.println("����ȣ"+this.getNumber()+" ���� ��ȣ��"+num+" �Դϴ�.");
		}
}