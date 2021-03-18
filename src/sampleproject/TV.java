package sampleproject;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean isPower() {
		return power;
	}
	public void power(boolean on) {
		this.power = on;
	}
	public void channel(int c) {
		if(c>255) {
			this.channel = 255;
		}else if(c<1) {
			this.channel = 1;
		}else {
			this.channel = c;
		}
	}
	public void channel(boolean up) {
		if(up == true) {
			if(this.channel<255) {
				this.channel++;
			}else {
				System.out.println("최대 입니다.");
			}
		}else {
			if(this.channel>1) {
				this.channel--;
			}else {
				System.out.println("체널 1 입니다");
			}
		}
	}
	public void volume(int v) {
		if(v>100) {
			this.volume = 100;
		}else if(v<0) {
			this.volume = 0;
		}else {
			this.volume = v;
		}
	}
	public void volume(boolean up) {
		if(up == true) {
			if(this.volume<100) {
				this.volume++;
			}else {
				System.out.println("최대 입니다.");
			}
		}else {
			if(this.volume>0) {
				this.volume--;
			}else {
				System.out.println("볼륨 0 입니다");
			}
		}
		
	}
	public TV() {}
	public TV(int channel, int volume, boolean power) {
		super();
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	public void status() {
		System.out.println(this.channel+","+this.volume+","+this.power);
	}
}
