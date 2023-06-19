package hust.soict.aims.media;

import java.util.*;

public class CompactDisc extends Disc implements Playable {
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();

	public CompactDisc() {
		super();
	}
	
	public CompactDisc(String title) {
		super();
		this.title = title;
	}
	
	public CompactDisc(String title, float cost, String artist) {
		super();
		this.title = title;
		this.cost = cost;
		this.artist = artist;
	}
	
	//toString
	public String toString() {
		return "CD - " + this.id + " " + this.title + " - " + this.category + " - " + this.director + " - " + this.artist + " - " + this.length + ": " + this.cost + "$";
	}
	
	//implement play
	public void play() {
		System.out.println("Playing CD: " + this.getTitle());
		System.out.println("CD length: " + this.getLength());
		for (Track t: this.tracks) {
			t.play();
		} 
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
