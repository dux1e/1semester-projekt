package controller;
import java.util.*;
import model.*;

public class OrderController {
	private OrderContainer orderContainer;
	private ProductController productController;
	private ArrayList<OrderLine> orderLines;
	private double netTotal;

	public OrderController() {
		orderContainer = OrderContainer.getInstance();
		productController = new ProductController();
		orderLines = new ArrayList<>();
	}
	
	public void addProduct(int barcode, int quantity) {
		Product product = productController.findProductByBarcode(barcode);
		OrderLine ol = new OrderLine(product, quantity);
		orderLines.add(ol);
	}
	
	private void calculateNetTotal() {
		netTotal = 0;
		for(int i = 0; i<orderLines.size(); i++) {
			netTotal += orderLines.get(i).
		}
	}
}
