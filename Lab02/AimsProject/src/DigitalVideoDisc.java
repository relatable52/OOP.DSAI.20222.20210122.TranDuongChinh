
public class DigitalVideoDisc {
	//attributes
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	
	//toString
	public String toString() {
		return "DVD - " + this.title + " - " + this.category + " - " + this.director + " - " + this.length + ": " + this.cost + "$";
	}
	
	//getters and setters
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
<<<<<<< Updated upstream:Lab02/Source/DigitalVideoDisc.java
=======
	public int getId() {
		return id;
	}
	public void setTitle(String newTitle) {
		this.title = newTitle;
	}
>>>>>>> Stashed changes:Lab02/AimsProject/src/DigitalVideoDisc.java
	
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
	
}
