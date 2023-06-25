package hust.soict.dsai.aims.screen;

import javax.swing.JFrame;

import hust.soict.dsai.aims.cart.*;
import hust.soict.dsai.aims.store.*;

public abstract class AddItemToStoreScreen extends JFrame {
	private Store store;
	private Cart cart;
	
	public Store getStore() {
		return store;
	}


	public Cart getCart() {
		return cart;
	}


	public AddItemToStoreScreen(Store store, Cart cart) {
		this.store = store;
		this.cart = cart;
	}
}