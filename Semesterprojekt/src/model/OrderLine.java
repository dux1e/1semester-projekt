package model;

public class OrderLine {
	private int quantity;
	private double subTotal;
	private Product product;
	private double discountFlat;
	private double discountPercent;
	
	public OrderLine(Product product) {
		this.quantity = 1;
		this.product = product;
		this.discountFlat = 0.0;
		this.discountPercent = 0.0;
		this.subTotal = calculateSubTotal();
	}
	
	public OrderLine(Product product, int quantity) {
		this.quantity = quantity;
		this.product = product;
		this.discountFlat = 0.0;
		this.discountPercent = 0.0;
		this.subTotal = calculateSubTotal();
	}
	
	public OrderLine(Product product, int quantity, double discountFlat, double discountPercent) {
		this.quantity = quantity;
		this.product = product;
		this.setDiscountFlat(discountFlat);;
		this.setDiscountPercent(discountPercent);
		this.subTotal = calculateSubTotal();
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
		calculateSubTotal();
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
		this.subTotal = quantity * this.getActualPricePrProduct();
		return subTotal;
	}
	
	public double getTotalDiscount() {
		return this.getActualDiscountPrProduct() * this.quantity;
	}
	
	public double getActualDiscountPrProduct() {
		double theDiscount = 0;
		if(discountFlat > 0.0) {
			theDiscount = -discountFlat;
		} else if(discountPercent > 0.0) {
			double discountCalculatingPercent = (discountPercent / 100);
			theDiscount = this.product.getActualPrice() * -discountCalculatingPercent;
		}
		return theDiscount;
	}
	
	public double getActualPricePrProduct() {
		double thePrice = this.product.getCatalogPrice() + this.getActualDiscountPrProduct();
		return thePrice;
	}
	
	public double getDiscountFlat() {
		return this.discountFlat;
	}
	
	public void setDiscountFlat(double discount) {
		if(discount > this.product.getCatalogPrice()) {
			this.discountFlat = this.product.getCatalogPrice();
		} else if(discount < 0) {
			this.discountFlat = 0.0;
		} else {
			this.discountFlat = discount;
		}
		calculateSubTotal();
	}
	
	public double getDiscountPercent() {
		return this.discountPercent;
	}
	
	public void setDiscountPercent(double discount) {
		if(discount > 100.0) {
			this.discountPercent = 100.0;
		} else {
			this.discountPercent = discount;
		}
		calculateSubTotal();
	}
}
