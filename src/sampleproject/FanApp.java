package sampleproject;

public class FanApp {

	public static void main(String[] args) {
		Fan f = new Fan(false,1,false);
		
		f.status();
		
		f.FanSpeed( -5 );
		f.Power( true );
		f.Tilt( true );
		
		f.status();
		
		f.FanSpeed( false );
		f.FanSpeed( false );
		f.Tilt( false );
		f.Power( false );
		f.status();

	}

}
