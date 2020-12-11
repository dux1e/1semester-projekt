package controller;
import java.util.*;
import model.*;

public class OrderController {
	private OrderContainer orderContainer;
	private ProductController productController;
	private ArrayList<OrderLine> orderLines;
	private double netTotal;
	private double vatTotal;

	public OrderController() {
		this.orderContainer = OrderContainer.getInstance();
		this.productController = new ProductController();
		this.orderLines = new ArrayList<>();
		this.netTotal = 0;
		this.vatTotal = 0;
	}
	
	public void addProduct(int barcode, int quantity) {
		Product product = productController.findProductByBarcode(barcode);
		OrderLine ol = new OrderLine(product, quantity);
		orderLines.add(ol);
		calculateTotals();
	}
	
	private void calculateTotals() {
		calculateNetTotal();
		calculateVatTotal();
	}
	
	private double calculateNetTotal() {
		netTotal = 0;
		for(int i = 0; i<orderLines.size(); i++) {
			netTotal += orderLines.get(i).getSubTotal();
		}
		return netTotal;
	}
	
	private double calculateVatTotal() {
		vatTotal = netTotal * 1.25;
		return vatTotal;
	}
}
