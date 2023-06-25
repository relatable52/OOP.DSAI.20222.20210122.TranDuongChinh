package hust.soict.dsai.aims;

import java.util.*;

import hust.soict.dsai.aims.cart.*;
import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.store.*;

public class Aims {
	private static Scanner mySc = new Scanner(System.in);
	private static Store myStore = new Store();
	private static Cart myCart = new Cart();
	private static Media cur = null;
	private static String state = "1"; 
	
	public Aims() {
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		myStore.addMedia(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		myStore.addMedia(dvd2);
		myStore.addMedia(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		myStore.addMedia(dvd3);
		
		Book book1 = new Book("Calculus 1", 19.99f);
		myStore.addMedia(book1);
		
		CompactDisc cd1 = new CompactDisc("Algebra", 34.25f, "Bui Xuan Dieu");
		myStore.addMedia(cd1);
	}
	
	public static void main(String[] args) {
		new Aims();
		while (state.length() > 0) {
			int input = 0;
			boolean reenter = true;
			try {
				prompt(state);
			}
			catch(Exception e) {
				if (e instanceof ArithmeticException) {
					reenter = false;
				}
				else {
					state = state.substring(0, state.length()-1);
				}
			}
			
			while(reenter) {
				try {
					input = Integer.parseInt(mySc.nextLine());
					if(input < 0 || input > 9) {
						throw new Exception();
					}
					reenter = false;
				}
				catch(Exception e) {
					System.out.println("Invalid input");
					System.out.println("Please try again");
				}
			}
			if(input == 0) {
				state = state.substring(0, state.length()-1);
			}
			else {
				state += input;
			}
		}
		System.exit(0);
	}
	
	public static void prompt(String state) throws Exception{
		boolean found;
		switch (state) {
			case "1":
				showMenu();
				break;
			case "11":
				System.out.println("Items in the store:");
				if(myStore.getItemsInStore().size()>0) {
					for(Media m: myStore.getItemsInStore()) {
						System.out.println(m);
					}
				}
				else {
					System.out.println("There are no item in store");
				}
				storeMenu();
				break;
			case "12":
				found = false;
				System.out.println("Please enter media's title or enter 0 to go back:");
				while(!found) {
					String title = mySc.nextLine();
					if(title.equals("0")) {
						break;
					}
					for(Media m: myStore.getItemsInStore()) {
						if(m.getTitle().equals(title)) {
							System.out.println(m);
							cur = m;
							found = true;
							break;
						}
					}
					if(!found) {
						System.out.println("No media found or invalid title");
						System.out.println("Please try again");
					}
				}
				if (found) {
					myStore.removeMedia(cur);
					System.out.println("Press 0 to go back");
				}
				else {
					throw new ArithmeticException();
				}
				break;
			case "13":
				myCart.printCart();
				cartMenu();
				break;
			case "131":
				filterMenu();
				break;
			case "1311":
				myCart.searchById();
				System.out.println("Enter 0 to go back");
				break;
			case "1312":
				myCart.searchByTitle();
				System.out.println("Enter 0 to go back");
				break;
			case "132":
				sortMenu();
				break;
			case "1321":
				myCart.sortByCost();
				myCart.printCart();
				break;
			case "1322":
				myCart.sortByTitle();
				myCart.printCart();
				break;
			case "133":
				found = false;
				System.out.println("Please enter media's title or enter 0 to go back:");
				while(!found) {
					String title = mySc.nextLine();
					if(title.equals("0")) {
						break;
					}
					for(Media m: myCart.getItemsOrdered()) {
						if(m.getTitle().equals(title)) {
							System.out.println(m);
							cur = m;
							found = true;
							break;
						}
					}
					if(!found) {
						System.out.println("No media found or invalid title");
						System.out.println("Please try again");
					}
				}
				if(found) {
					myCart.removeMedia(cur);
					System.out.println("Enter 0 to go back");
				}
				else {
					throw new ArithmeticException();
				}
				break;
			case "134":
				found = false;
				System.out.println("Please enter media's title or enter 0 to go back:");
				while(!found) {
					String title = mySc.nextLine();
					if(title.equals("0")) {
						break;
					}
					for(Media m: myCart.getItemsOrdered()) {
						if(m.getTitle().equals(title)) {
							System.out.println(m);
							cur = m;
							found = true;
							break;
						}
					}
					if(!found) {
						System.out.println("No media found or invalid title");
						System.out.println("Please try again");
					}
				}
				if(found) {
					if(cur instanceof DigitalVideoDisc) {
						((DigitalVideoDisc)cur).play();
					}
					else if(cur instanceof CompactDisc) {
						((CompactDisc)cur).play();
					}
					else {
						System.out.println("Media not playable");
					}
					System.out.println("Press 0 to go back");
				}
				else {
					throw new ArithmeticException();
				}
				break;
			case "135":
				System.out.println("A order has been placed.");
				myCart = new Cart();
				System.out.println("Press 0 to go back");
				break;
			case "111":
				found = false;
				System.out.println("Please enter media's title or enter 0 to go back:");
				while(!found) {
					String title = mySc.nextLine();
					if(title.equals("0")) {
						break;
					}
					for(Media m: myStore.getItemsInStore()) {
						if(m.getTitle().equals(title)) {
							System.out.println(m);
							cur = m;
							found = true;
							break;
						}
					}
					if(!found) {
						System.out.println("No media found or invalid title");
						System.out.println("Please try again");
					}
				}
				if(found) {
					mediaDetailsMenu();
				}
				else {
					throw new ArithmeticException();
				}
				break;
			case "112":
				found = false;
				System.out.println("Please enter media's title or enter 0 to go back:");
				while(!found) {
					String title = mySc.nextLine();
					if(title.equals("0")) {
						break;
					}
					for(Media m: myStore.getItemsInStore()) {
						if(m.getTitle().equals(title)) {
							System.out.println(m);
							cur = m;
							found = true;
							break;
						}
					}
					if(!found) {
						System.out.println("No media found or invalid title");
						System.out.println("Please try again");
					}
				}
				if (found) {
					myCart.addMedia(cur);
					System.out.println("Press 0 to go back");
				}
				else {
					throw new ArithmeticException();
				}
				break;
			case "113":
				found = false;
				System.out.println("Please enter media's title or enter 0 to go back:");
				while(!found) {
					String title = mySc.nextLine();
					if(title.equals("0")) {
						break;
					}
					for(Media m: myStore.getItemsInStore()) {
						if(m.getTitle().equals(title)) {
							System.out.println(m);
							cur = m;
							found = true;
							break;
						}
					}
					if(!found) {
						System.out.println("No media found or invalid title");
						System.out.println("Please try again");
					}
				}
				if (found) {
					if(cur instanceof DigitalVideoDisc) {
						((DigitalVideoDisc)cur).play();
					}
					else if(cur instanceof CompactDisc) {
						((CompactDisc)cur).play();
					}
					else {
						System.out.println("Media not playable");
					}
					System.out.println("Press 0 to go back");
				}
				else {
					throw new ArithmeticException();
				}
				break;
			case "114":
				prompt("13");
				break;
			case "1141":
				prompt("131");
				break;
			case "1142":
				prompt("132");
				break;
			case "11411":
				prompt("1311");
				break;
			case "11412":
				prompt("1312");
				break;
			case "11421":
				prompt("1321");
				break;
			case "11422":
				prompt("1322");
				break;
			case "1143":
				prompt("133");
				break;
			case "1144":
				prompt("134");
				break;
			case "1145":
				prompt("135");
				break;
			case "1111":
				myCart.addMedia(cur);
				System.out.println("Press 0 to go back");
				break;
			case "1112":
				if(cur instanceof DigitalVideoDisc) {
					((DigitalVideoDisc)cur).play();
				}
				else if(cur instanceof CompactDisc) {
					((CompactDisc)cur).play();
				}
				else {
					System.out.println("Media not playable");
				}
				System.out.println("Press 0 to go back");
				break;
			default:
				System.out.println("Invalid input");
				System.out.println("Please re-enter");
				throw new Exception();
		}
	}
	
	public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Remove media from store");
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
	
	public static void filterMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter by ID");
		System.out.println("2. Filter by title");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}
	
	public static void sortMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Sort by cost");
		System.out.println("2. Sort by title");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}

}
