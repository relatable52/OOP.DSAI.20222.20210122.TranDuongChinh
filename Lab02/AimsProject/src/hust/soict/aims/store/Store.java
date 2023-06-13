package hust.soict.aims.store;

import hust.soict.aims.media.*;
import java.util.*;

public class Store {
	private ArrayList<Media> ItemsInStore = new ArrayList<Media>();
	
	public Store() {}
	
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
