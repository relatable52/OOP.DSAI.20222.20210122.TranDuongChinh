package hust.soict.aims.store;

import hust.soict.aims.media.*;
import java.util.*;

public class Store {
	private ArrayList<Media> ItemsInStore = new ArrayList<Media>();
	
	public Store() {
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		this.ItemsInStore.add(dvd1);
		this.ItemsInStore.add(dvd1);
		this.ItemsInStore.add(dvd1);
		
		Book book1 = new Book("Calculus 1");
		this.ItemsInStore.add(book1);
		this.ItemsInStore.add(book1);
		this.ItemsInStore.add(book1);
		this.ItemsInStore.add(book1);
		
		CompactDisc cd1 = new CompactDisc("Algebra");
		this.ItemsInStore.add(cd1);
		this.ItemsInStore.add(cd1);
		this.ItemsInStore.add(cd1);

	}
	
	public ArrayList<Media> getItemsInStore() {
		return this.ItemsInStore;
	}
	
	public void addMedia(Media m) {
		this.ItemsInStore.add(m);
		System.out.println("One disc added to store.");

	}
	
	public void removeMedia(Media m) {
		this.ItemsInStore.remove(m);
		System.out.println("One disc removed from store.");
	}
}
