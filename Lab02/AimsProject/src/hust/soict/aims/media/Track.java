package hust.soict.aims.media;

public class Track implements Playable {
	private String title;
	private int length;
	
	public Track() {
		// TODO Auto-generated constructor stub
	}
	
	public String getTitle() {
		return title;
	}

	public int getLength() {
		return length;
	}
	
	//implement play
	public void play() {
		System.out.println("Playing track: " + this.getTitle());
		System.out.println("Track length: " + this.getLength());
	}

}
