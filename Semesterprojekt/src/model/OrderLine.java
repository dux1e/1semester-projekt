package model;

public class OrderLine {
	private int quantity;
	private double subTotal;
	private Product product;
	
	public OrderLine(Product product) {
		this.quantity = 1;
		this.product = product;
		this.subTotal = calculateSubTotal();
	}
	
	public OrderLine(Product product, int quantity) {
		this.quantity = quantity;
		this.product = product;
		this.subTotal = calculateSubTotal();
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
		this.subTotal = calculateSubTotal();
	}
	
	public Product getProduct() {
		return product;
	}
	
	public void setProduct(Product product) {
		this.product = product;
		if(this.quantity < 1) {
			this.quantity = 1;
		}
		subTotal = calculateSubTotal();
	}

	public double getSubTotal() {
		return subTotal;
	}
	
	private double calculateSubTotal() {
		subTotal = quantity * product.getActualPrice();
		return subTotal;
	}

}
