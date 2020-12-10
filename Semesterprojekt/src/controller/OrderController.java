package controller;

import model.*;

public class OrderController {
	private OrderContainer orderContainer;

	public void OrderContainer() {
		orderContainer = OrderContainer.getInstance();
	}
	
	public Product findProductByBarcode(int barcode) {
		return null;
	}
}
