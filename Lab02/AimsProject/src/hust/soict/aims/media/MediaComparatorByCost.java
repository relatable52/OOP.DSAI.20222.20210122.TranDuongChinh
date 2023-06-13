package hust.soict.aims.media;

import java.util.Comparator;

public class MediaComparatorByCost implements Comparator<Media>{

	public int compare(Media o1, Media o2) {
		return(Float.compare(o1.getCost(), o2.getCost()));
	}

}
