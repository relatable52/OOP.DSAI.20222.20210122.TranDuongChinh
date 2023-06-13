package hust.soict.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitle implements Comparator<Media>{
	public int compare(Media o1, Media o2) {
		return(o1.getTitle().compareTo(o2.getTitle()));
	}
}
