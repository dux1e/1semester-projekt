package model;

public class Product {
	private int barcode;
	private String description;
	private double price;
	private int stockMax;
	private int stockMin;
	private double discountFlat;
	private double discountPercent;
	
	public Product(int barcode, String description) {
		this.barcode = barcode;
		this.description = description;
	}
	
	public Product(int barcode, String description, double price) {
		this.barcode = barcode;
		this.description = description;
		this.price = price;
	}
	
	public int getBarcode() {
		return barcode;
	}

	public void setBarcode(int barcoce) {
		this.barcode = barcoce;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockMax() {
		return stockMax;
	}

	public void setStockMax(int stockMax) {
		this.stockMax = stockMax;
	}

	public int getStockMin() {
		return stockMin;
	}

	public void setStockMin(int stockMin) {
		this.stockMin = stockMin;
	}

	public double getDiscountFlat() {
		return discountFlat;
	}

	public void setDiscountFlat(int discountFlat) {
		this.discountFlat = discountFlat;
	}
	
	public double getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(int discountPercent) {
		this.discountPercent = discountPercent;
	}

}
