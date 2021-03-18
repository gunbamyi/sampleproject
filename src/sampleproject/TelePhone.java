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
			System.out.println("전원이 켜졌습니다.");
		}else  {
			System.out.println("전원이 꺼졌습니다.");
		}
	}
		@Override
		public void call(String num) {
			System.out.println("내번호"+this.getNumber()+" 상대방 번호는"+num+" 입니다.");
		}
}