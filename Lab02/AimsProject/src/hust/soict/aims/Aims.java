package hust.soict.aims;

import hust.soict.aims.store.*;
import hust.soict.aims.media.*;
import hust.soict.aims.test.cart.*;
import java.util.*;

public class Aims {
	private static Scanner mySc = new Scanner(System.in);
	private Media cur = null;
	public static void main(String[] args) {
		Store myStore = new Store();
		String mode = "";
		while(mode != "0") {
			prompt(mode, myStore);
			String input = mySc.nextLine();
			if(input == "0" && mode != "") {
				mode = mode.substring(0, input.length()-1);
			}
			else {
				mode += input;
			}
		}
	}
	
	public void prompt(String mode, Store myStore) {
		switch(mode) {
		case "":
			showMenu();
			break;
		case "1":
			storeMenu();
			break;
		case "2":
			break;
		case "3":
			break;
		case "4":
			break;
		case "11":
			this.cur = seeMedia(myStore);
			mediaDetailsMenu();
			break;
		}
	}
	
	public Media seeMedia(Store myStore) {
		System.out.println("Enter the media's id:");
		int input = Integer.parseInt(mySc.nextLine());
		Media output = null;
		for (Media m: myStore.getItemsInStore()) {
			if(m.getId() == input) {
				output = m;
				break;
			}
		}
		System.out.println(output);
		return output;
;	}
	
	public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
	}
	
	public static void storeMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media’s details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}
	
	public static void mediaDetailsMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}
	
	public static void cartMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
	}



}
