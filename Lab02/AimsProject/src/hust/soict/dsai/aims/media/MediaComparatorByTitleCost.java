package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media>{
	public int compare(Media o1, Media o2) {
		int byCost = Float.compare(o1.getCost(), o2.getCost());
		int byTitle = o1.getTitle().compareTo(o2.getTitle());
		int ret = 0;
		if(byTitle == 0) {
			ret = byCost;
		}
		else {
			ret = byTitle;
		}
		return ret;
	}
}
