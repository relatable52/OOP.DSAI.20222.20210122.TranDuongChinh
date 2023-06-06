
public class Store {
	private DigitalVideoDisc[] itemsInStore;
	private int numberInStore;
	
	public Store() {
		this.itemsInStore = new DigitalVideoDisc[256];
		this.numberInStore = 0;
	}
	
	public DigitalVideoDisc[] getItemsInStore() {
		DigitalVideoDisc[] ret = new DigitalVideoDisc[this.numberInStore];
		for(int i=0; i<this.numberInStore; i++) {
			ret[i] = this.itemsInStore[i];
		}
		return ret;
	}
	
	public void addDVD(DigitalVideoDisc d) {
		this.itemsInStore[numberInStore] = d;
		this.numberInStore++;
		System.out.println("One disc added to store.");
	}
	public void removeDVD(DigitalVideoDisc d) {
		int numRemoved = 0;
		for(int i=0; i<this.numberInStore; i++) {
			if(this.itemsInStore[i] == d) {
				for(int j = 0; j<this.numberInStore; j++) {
					this.itemsInStore[j] = this.itemsInStore[j+1];
				}
				i--;
				numRemoved++;
				this.numberInStore--;
			}
		}
		System.out.println(numRemoved + " DVDs removed.");
	}
}
