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
	
	public Order createOrder() {
		if(this.currentOrder == null) {
			Employee e = this.employeeController.getCurrentEmployee();
			this.currentOrder = new Order(e);
		} else {
			System.out.println("En ordre er under behandling. Færdiggør nuværende ordre inden du laver en ny.");
		}
		return this.currentOrder;
	}
	
	public OrderLine addProduct(int barcode, int quantity) {
		Product product = productController.findProductByBarcode(barcode);
		OrderLine ol = new OrderLine(product, quantity);
		this.currentOrder.addOrderLine(ol);
		return ol;
	}
	
	public void findCustomerByID(int id) {
		Customer c = this.customerController.findCustomerByID(id);
		this.currentOrder.setCustomer(c);
	}
	
	public void endOrder() {
		if(this.currentOrder != null) {
			this.orderContainer.addOrder(currentOrder);
			this.currentOrder = null;
		} else {
			System.out.println("Der er ingen ordrer at afslutte. Begynd en ordre før du kan afslutte den.");
		}
	}
	
	public Order findOrderByOrderNo(int no) {
		Order theOrder = this.orderContainer.findOrderByOrderNo(no);
		return theOrder;
	}
	
	// getters and setter below
	public Order getCurrentOrder() {
		return currentOrder;
	}
	
	public void setEmployeeController(EmployeeController ec) {
		this.employeeController = ec;
	}
}
