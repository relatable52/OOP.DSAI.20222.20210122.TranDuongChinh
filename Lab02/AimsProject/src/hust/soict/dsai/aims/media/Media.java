package hust.soict.dsai.aims.media;

import java.util.*;

public class Media {
	protected int id;
	protected String title;
	protected String category;
	protected float cost;
	protected static int total = 0;
	
	//comparator
	public static final Comparator<Media> COMPARE_BY_TITLE = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST = new MediaComparatorByCostTitle();
	
	public Media() {
		total++;
		this.id = total;
	}
	
	//equals
	public boolean equals(Object obj) {
		return(((Media)obj).getTitle() == this.title);
	}
	
	//Getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

}
