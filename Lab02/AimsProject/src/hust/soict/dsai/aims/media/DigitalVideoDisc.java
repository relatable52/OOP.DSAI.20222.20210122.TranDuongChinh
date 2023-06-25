package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
	//toString
	public String toString() {
		return "DVD - " + this.id + " " + this.title + " - " + this.category + " - " + this.director + " - " + this.length + ": " + this.cost + "$";
	}

	//constructors
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	
	//isMatch
	public boolean isMatch(String t) {
		return(this.title.contains(t));
	}
	
	//implement play
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	
}
