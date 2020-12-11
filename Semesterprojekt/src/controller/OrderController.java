package controller;
import model.*;

public class OrderController {
	private OrderContainer orderContainer;
	private EmployeeController employeeController;
	private ProductController productController;
	private CustomerController customerController;
	private Order currentOrder;

	public OrderController() {
		this.orderContainer = OrderContainer.getInstance();
		this.employeeController = new EmployeeController();
		this.productController = new ProductController();
		this.customerController = new CustomerController();
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
	
	public void findCustomerByID(int id) {
		Customer c = this.customerController.findCustomerByID(id);
		this.currentOrder.setCustomer(c);
	}
}
