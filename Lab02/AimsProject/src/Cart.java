
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
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
					itemsOrdered[i] =  itemsOrdered[i+1];
				}
				qutyOrdered--;
				numRemoved++;
			}
		}
		if (numRemoved == 0) {
			System.out.println("No DVD has been removed.");
		}
		if (numRemoved == 1) {
			System.out.println("One DVD has been removed.");
		}
		if (numRemoved > 1) {
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
}
