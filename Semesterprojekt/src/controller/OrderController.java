package controller;
import model.*;

public class OrderController {
	private OrderContainer orderContainer;
	private EmployeeController employeeController;
	private ProductController productController;
	private Order currentOrder;

	public OrderController() {
		this.orderContainer = OrderContainer.getInstance();
		this.employeeController = new EmployeeController();
		this.productController = new ProductController();
		this.currentOrder = null;
	}
	
	public void createOrder() {
		Employee e = this.employeeController.getCurrentEmployee();
		currentOrder = new Order(e);
	}
	
	public void addProduct(int barcode, int quantity) {
		Product product = productController.findProductByBarcode(barcode);
		OrderLine ol = new OrderLine(product, quantity);
		this.currentOrder.addOrderLine(ol);
	}
}
