package hust.soict.aims.cart;

import java.util.*;
import hust.soict.aims.media.*;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	//private int qutyOrdered = 0;
	
	public Cart() {}
	
	public boolean addMedia(Media m) {
		if(this.itemsOrdered.size() > MAX_NUMBERS_ORDERED) {
			System.out.println("Cart already full");
			return false;
		}
		else {
			this.itemsOrdered.add(m);
			System.out.println("Media added");
		}
		System.out.println("Total number in cart: " + this.itemsOrdered.size());
		return true;
	}
	
	public boolean removeMedia(Media m) {
		boolean ret = this.itemsOrdered.remove(m);
		if(ret) {
			System.out.println("Media removed");
		}
		else {
			System.out.println("No media in cart");
		}
		System.out.println("Total number in cart: " + this.itemsOrdered.size());
		return ret;
	}
	
	public float totalCost() {
		float total = 0;
		for(Media m: itemsOrdered) {
			total += m.getCost();
		}
		return total;
	}
	
	public void printCart() {
		System.out.println("***********************CART***********************");
		for(int i=0; i<this.itemsOrdered.size(); i++) {
			System.out.println((i + 1) + ". " + this.itemsOrdered.get(i));
		}
		System.out.println("Total cost: " + this.totalCost() + "$");
		System.out.println("**************************************************");
	}
	
	public void searchById() {
		Scanner userInput = new Scanner(System.in);
		boolean matchFound = false;
		System.out.print("Enter the DVD's ID: ");
		int inputId = Integer.parseInt(userInput.nextLine());
		for(Media m: this.itemsOrdered) {
			if(m.getId() == inputId) {
				System.out.println("+  " + m);
				matchFound = true;
			}
		}
		if(!matchFound) {
			System.out.println("No matching DVD found.");
		}
	}
	
	public void searchByTitle() {
		Scanner userInput = new Scanner(System.in);
		boolean matchFound = false;
		System.out.print("Enter the keyword: ");
		String inputKeyword = userInput.nextLine();
		for(Media m: this.itemsOrdered) {
			if(m.getTitle().contains(inputKeyword)) {
				System.out.println("+  " + m);
				matchFound = true;
			}
		}
		if(!matchFound) {
			System.out.println("No matching DVD found.");
		}
	}
	
	public void sortByTitle() {
		Collections.sort(this.itemsOrdered, Media.COMPARE_BY_TITLE);
	}
	
	public void sortByCost() {
		Collections.sort(this.itemsOrdered, Media.COMPARE_BY_COST);
	}

	public ArrayList<Media> getItemsOrdered() {
		return itemsOrdered;
	}
}
