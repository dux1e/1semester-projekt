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
		Order o = null;
		if(this.currentOrder == null) {
			Employee e = this.employeeController.getCurrentEmployee();
			this.currentOrder = new Order(e);
			o = this.currentOrder;
			findCustomerByID(0);
		} else {
			throw new IllegalStateException("En ordre er under behandling. Færdiggør nuværende ordre inden du laver en ny.");
		}
		return o;
	}
	
	public OrderLine addProduct(int barcode, int quantity) {
		OrderLine ol = null;
		if(this.currentOrder != null) {
			Product product = productController.findProductByBarcode(barcode);
			if(product == null) {
				throw new NullPointerException("Der findes intet product med barkoden: " + barcode + ".");
			}
			ol = new OrderLine(product, quantity);
			this.currentOrder.addOrderLine(ol);
		} else {
			throw new IllegalStateException("Der er endnu ikke oprettet en ordrer.");
		}
		return ol;
	}
	
	public OrderLine addProduct(Product product, int quantity, double discountFlat, double discountPercent) {
		OrderLine ol = null;
		if(this.currentOrder != null) {
			ol = new OrderLine(product, quantity, discountFlat, discountPercent);
			this.currentOrder.addOrderLine(ol);
		} else {
			throw new IllegalStateException("Der er endnu ikke oprettet en ordrer.");
		}
		return ol;
	}
	
	public Customer findCustomerByID(int id) {
		Customer c = null;
		if(this.currentOrder != null) {
			c = this.customerController.findCustomerByID(id);
			if(c == null) {
				throw new NullPointerException("Der findes ingen kunde med ID: " + id + ".");
			}
			this.currentOrder.setCustomer(c);
		} else {
			throw new IllegalStateException("Der er endnu ikke oprettet en ordrer.");
		}
		return c;
	}
	
	public void addCustomer(Customer c) {
		if(this.currentOrder != null) {
			this.currentOrder.setCustomer(c);
		} else {
			throw new IllegalStateException("Der er endnu ikke oprettet en ordrer.");
		}
	}
	
	public void endOrder() {
		if(validateOrder()) {
			this.orderContainer.addOrder(currentOrder);
			this.currentOrder = null;
		} else {
			throw new IllegalStateException("Der er ingen ordrer at afslutte. Begynd og udfyld en ordre før du afslutter den.");
		}
	}
	
	private boolean validateOrder() {
		boolean haveAnOrder = this.currentOrder != null;
		boolean hasCustomer = this.currentOrder.getCustomer() != null;
		boolean hasOrderLine = this.currentOrder.getOrderLines().size() != 0;
		boolean orderOK = haveAnOrder && hasCustomer && hasOrderLine;
		return orderOK;
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

	public EmployeeController getEmployeeController() {
		return employeeController;
	}

	public ProductController getProductController() {
		return productController;
	}

	public CustomerController getCustomerController() {
		return customerController;
	}
	
}
