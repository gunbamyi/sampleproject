package sampleproject;

public class Fan {
	private boolean power;
	private int fanSpeed;
	private boolean tilt;
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public void Power(boolean on) {
		this.power = on;
	}
	public int getFanSpeed() {
		return fanSpeed;
	}
	public void setFanSpeed(int fanSpeed) {
		this.fanSpeed = fanSpeed;
	}
	public boolean isTilt() {
		return tilt;
	}
	public void setTilt(boolean tilt) {
		this.tilt = tilt;
	}
	public void Tilt(boolean on) {
		this.tilt = on;
	}
	public void FanSpeed(int s) {
		if(s>=5) {
			this.fanSpeed = 5;
		}else if(s<0) {
			this.fanSpeed = 0;
		}else {
			this.fanSpeed = s;
		}
	}public void FanSpeed(boolean up) {
		if(up) {
			if(this.fanSpeed<=5) {
				this.fanSpeed++;
			}else {
				
			}
		}else {
			if(this.fanSpeed>0) {
				this.fanSpeed--;
			}else {
				
			}
		}
	}
	public Fan(boolean power, int fanSpeed, boolean tilt) {
		super();
		this.power = power;
		this.fanSpeed = fanSpeed;
		this.tilt = tilt;
	}
	public void status() {
	    System.out.println(" === ¼±Ç³±â Á¤º¸ ===");
	    System.out.println(" Àü¿ø : " + this.isPower());
	    System.out.println(" Ç³¼Ó : " + this.getFanSpeed());
	    System.out.println(" Ç³Çâ : " + this.isTilt());
	    System.out.println(" ===   END  ===");
	  }
	
}
