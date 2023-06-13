package hust.soict.aims.media;

import java.util.*;

public class CompactDisc extends Disc{
	private String artist;
	private ArrayList<Track> tracks;

	public CompactDisc() {
		super();
	}
	
	public boolean addTrack(Track track) {
		boolean ret = true;
		for(Track t: tracks) {
			if(t == track) {
				ret = false;
			}
		}
		if(ret) {
			this.tracks.add(track);
			System.out.println("Track added");
		}
		else {
			System.out.println("Duplicate track");
		}
		return ret;
	}
	
	public boolean removeTrack(Track track) {
		boolean ret = this.tracks.remove(track);
		if(ret) {
			System.out.println("Track removed");
		}
		else {
			System.out.println("Track not in list");
		}
		return ret;
	}
	
	public int getLength() {
		int length = 0;
		for(Track t: this.tracks) {
			length += t.getLength();
		}
		return length;
	}

	public String getArtist() {
		return artist;
	}

}
