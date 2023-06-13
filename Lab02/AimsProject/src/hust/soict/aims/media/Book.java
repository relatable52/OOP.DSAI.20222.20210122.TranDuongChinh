package hust.soict.aims.media;

import java.util.*;

public class Book extends Media{
	private List<String> authors = new ArrayList<String>();
	
	public Book() {
		super();
	}
	
	public Book(String title) {
		super();
		this.title = title;
	}
	
	//toString
	public String toString() {
		return "Book - " + this.id + " " + this.title + " - " + this.category + " : " + this.cost + "$";
	}
	
	public boolean addAuthor(String authorName) {
		boolean ret = true;
		for(String a: this.authors) {
			if(a == authorName) {
				ret = false;
			}
		}
		if(ret) {
			this.authors.add(authorName);
			System.out.println("Author added");
		}
		else {
			System.out.println("Duplicate author");
		}
		return ret;
	}	
	
	public boolean removeAuthor(String authorName) {
		boolean ret = this.authors.remove(authorName);
		if(ret) {
			System.out.println("Author removed");
		}
		else {
			System.out.println("Author not in list");
		}
		return ret;
	}

}
