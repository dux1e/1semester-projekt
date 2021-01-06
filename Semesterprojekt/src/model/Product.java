package model;

public class Product implements Listable {
	private int barcode;
	private String description;
	private String brand;
	private double price;
	private int stockMax;
	private int stockMin;
	private double discountFlat;
	private double discountPercent;
	
	public Product(int barcode, String description, String brand) {
		this.barcode = barcode;
		this.description = description;
		this.setBrand(brand);
		this.price = 0.0;
		this.stockMin = 0;
		this.stockMax = 0;
	}
	
	public Product(int barcode, String description, String brand, double price, int stockMin, int stockMax) {
		this.barcode = barcode;
		this.description = description;
		this.setBrand(brand);
		this.price = price;
		this.stockMin = stockMin;
		this.stockMax = stockMax;
	}
	
	public String getStringToList() {
		String description = this.getDescription();
		String barcode = String.valueOf(this.getBarcode());
		String theString = description + " - " + barcode;
		return theString;
	}
	
	// getters and setters below
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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
