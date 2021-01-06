package controller;

import java.util.ArrayList;

import model.*;

public class ProductController {
	private ProductContainer productContainer;

	public ProductController() {
		productContainer = ProductContainer.getInstance();
	}
	
	public void addProduct(int barcode, String description, String brand, double catalogPrice, double costPrice, int stockMin, int stockMax) {
		Product p = new Product(barcode, description, brand, catalogPrice, costPrice, stockMin, stockMax);
		this.productContainer.addProduct(p);
	}
	
	public Product findProductByBarcode(int barcode) {
		return productContainer.findProductByBarcode(barcode);
	}
	
	public ArrayList<Listable> searchViaInput(String input) {
		return productContainer.searchViaInput(input);
	}
}
