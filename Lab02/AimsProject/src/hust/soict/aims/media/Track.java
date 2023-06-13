package hust.soict.aims.media;

public class Track implements Playable {
	private String title;
	private int length;
	
	public Track() {
		// TODO Auto-generated constructor stub
	}
	
	//equals
	public boolean equals(Object obj) {
		return(((Track)obj).getTitle() == this.title && ((Track)obj).getLength() == this.length);
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
