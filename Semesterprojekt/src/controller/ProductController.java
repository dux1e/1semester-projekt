package controller;

import model.*;

public class ProductController {
	private ProductContainer productContainer;

	public ProductController() {
		productContainer = ProductContainer.getInstance();
	}
	
	public Product findProductByBarcode(int barcode) {
		return productContainer.findProductByBarcode(barcode);
	}
}
