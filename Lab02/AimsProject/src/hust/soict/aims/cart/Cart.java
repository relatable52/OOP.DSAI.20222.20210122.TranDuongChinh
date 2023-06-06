package hust.soict.aims.cart;
import java.util.Scanner;

import hust.soict.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED+1];
	private int qutyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qutyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is already full.");
		}
		else {
			itemsOrdered[qutyOrdered] = disc;
			qutyOrdered++;
			System.out.println("The disc has been added.");
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc[] discs) {
		int added = 0;
		int fail = 0;
		
		for (int i = 0; i<discs.length; i++) {
			if(qutyOrdered == MAX_NUMBERS_ORDERED) {
				fail++;
			}
			else {
				itemsOrdered[qutyOrdered] = discs[i];
				qutyOrdered++;
				added++;
			}
		}
		
		System.out.println(added + " discs have been added.");
		System.out.println(fail + " discs fail to be added.");
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc, DigitalVideoDisc... discs) {
		int added = 0;
		int fail = 0;
		
		if (qutyOrdered == MAX_NUMBERS_ORDERED) {
			fail++;
		}
		else {
			itemsOrdered[qutyOrdered] = disc;
			qutyOrdered++;
			added++;
		}
		
		for (DigitalVideoDisc d: discs) {
			if (qutyOrdered == MAX_NUMBERS_ORDERED) {
				fail++;
			}
			else {
				itemsOrdered[qutyOrdered] = d;
				qutyOrdered++;
				added++;
			}
		}
		
		System.out.println(added + " discs have been added.");
		System.out.println(fail + " discs fail to be added.");
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		int added = 0;
		int fail = 0;
		
		if (qutyOrdered == MAX_NUMBERS_ORDERED) {
			fail++;
		}
		else {
			itemsOrdered[qutyOrdered] = dvd1;
			qutyOrdered++;
			added++;
		}
		
		if (qutyOrdered == MAX_NUMBERS_ORDERED) {
			fail++;
		}
		else {
			itemsOrdered[qutyOrdered] = dvd2;
			qutyOrdered++;
			added++;
		}
		
		System.out.println(added + " discs have been added.");
		System.out.println(fail + " discs fail to be added.");
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int numRemoved = 0;
		for(int i=0; i<qutyOrdered; i++) {
			if(itemsOrdered[i] == disc) {
				for(int j = i; j<qutyOrdered; j++) {
					itemsOrdered[j] =  itemsOrdered[j+1];
				}
				numRemoved++;
				i--;
				qutyOrdered--;
			}
		}
		if (numRemoved == 0) {
			System.out.println("No DVD has been removed.");
		}
		if (numRemoved > 0) {
			System.out.println(numRemoved + " DVD has been removed.");
		}
	}
	
	public float totalCost() {
		float total = 0;
		for(int i=0; i<qutyOrdered; i++) {
			total += itemsOrdered[i].getCost();
		}
		return total;
	}
	
	public void printCart() {
		System.out.println("***********************CART***********************");
		for(int i=0; i<qutyOrdered; i++) {
			System.out.println((i + 1) + ". " + itemsOrdered[i]);
		}
		System.out.println("Total cost: " + this.totalCost() + "$");
		System.out.println("***************************************************");
	}
	
	public void searchById() {
		Scanner userInput = new Scanner(System.in);
		boolean matchFound = false;
		System.out.print("Enter the DVD's ID: ");
		int inputId = Integer.parseInt(userInput.nextLine());
		for(int i=0; i<qutyOrdered; i++) {
			if(itemsOrdered[i].getId() == inputId) {
				System.out.println("+  " + itemsOrdered[i]);
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
		for(int i=0; i<qutyOrdered; i++) {
			if(itemsOrdered[i].isMatch(inputKeyword)) {
				System.out.println("+  " + itemsOrdered[i]);
				matchFound = true;
			}
		}
		if(!matchFound) {
			System.out.println("No matching DVD found.");
		}
	}
}
