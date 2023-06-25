package hust.soict.dsai.aims.test.store;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.store.Store;

public class StroreTest {
	public static void main(String[] args) {
		Store myStore = new Store();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		myStore.addMedia(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		myStore.addMedia(dvd2);
		myStore.addMedia(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		myStore.addMedia(dvd3);
		
		System.out.println("List of DVDs in store:");
		for(Media d: myStore.getItemsInStore()) {
			System.out.println("+ " + d);
		}
		
		myStore.removeMedia(dvd3);
		System.out.println("List of DVDs in store:");
		for(Media d: myStore.getItemsInStore()) {
			System.out.println("+ " + d);
		}
	}
}
