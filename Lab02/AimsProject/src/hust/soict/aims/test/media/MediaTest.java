package hust.soict.aims.test.media;

import java.util.*;
import hust.soict.aims.media.*;

public class MediaTest {
	public static void main(String[] args) {
		List<Media> media = new ArrayList<Media>();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		media.add(dvd1);
		
		Book book1 = new Book("Calculus 1");
		media.add(book1);
		
		CompactDisc cd1 = new CompactDisc("English");
		media.add(cd1);
		
		for(Media m: media) {
			System.out.println(m);
		}
	}
}
