package model;

public class Product {
	private int barcoce;
	private String description;
	private double price;
	private int stockMax;
	private int stockMin;
	private double discountFlat;
	private double discountPercent;
	
	public Product() {
		
	}
	

	public int getBarcoce() {
		return barcoce;
	}

	public void setBarcoce(int barcoce) {
		this.barcoce = barcoce;
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
	
	

}
