package hust.soict.aims.test.store;

import hust.soict.aims.disc.DigitalVideoDisc;
import hust.soict.aims.store.Store;

public class StroreTest {
	public static void main(String[] args) {
		Store myStore = new Store();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		myStore.addDVD(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		myStore.addDVD(dvd2);
		myStore.addDVD(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		myStore.addDVD(dvd3);
		
		System.out.println("List of DVDs in store:");
		for(DigitalVideoDisc d: myStore.getItemsInStore()) {
			System.out.println("+ " + d);
		}
		
		myStore.removeDVD(dvd3);
		System.out.println("List of DVDs in store:");
		for(DigitalVideoDisc d: myStore.getItemsInStore()) {
			System.out.println("+ " + d);
		}
	}
}
