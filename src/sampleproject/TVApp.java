package sampleproject;

public class TVApp {

	public static void main(String[] args) {
		TV tv = new TV(7, 20, false);
		
		System.out.println( tv.getVolume() );
		System.out.println( tv.getChannel() );
		System.out.println( tv.isPower() );
		
		tv.status();
		
		tv.power( true );
		tv.volume( -100 );
		tv.status();
		
		tv.volume( false );
		tv.status();
		
		tv.channel( 0 );
		tv.status();
		
		tv.channel( true );
		tv.channel( true );
		tv.channel( true );
		tv.status();
		
		tv.power( false );
		tv.status();

	}

}
