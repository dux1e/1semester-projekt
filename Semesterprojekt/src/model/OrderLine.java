package model;

public class OrderLine {
private int quantity;
private double subTotal;
private Product product;
public OrderLine(Product product, int quantity) {
	this.quantity = quantity;
	subTotal = calculateSubTotal();
	this.product = product;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
	subTotal = calculateSubTotal();
}
public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
	subTotal = calculateSubTotal();
}

public double calculateSubTotal() {
	subTotal = quantity * product.getPrice();
	return subTotal;
}

}
