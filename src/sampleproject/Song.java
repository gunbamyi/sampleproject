package sampleproject;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private String track;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getTrack() {
		return track;
	}
	public void setTrack(String track) {
		this.track = track;
	}
	public Song(String title, String artist) {
	this(title,artist,"_","_","_","_");
	}
	public Song(String title, String artist, String album, String composer, String year, String track) {
		super();
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	public void showInfo() {
		System.out.println(this.title+", "+this.artist+" ("+this.album+", "+this.composer+", "+this.year+", "+this.track+" )");
	}

}
