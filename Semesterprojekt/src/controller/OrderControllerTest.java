package controller;
import model.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrderControllerTest {
	private CustomerController cc;
	private Employee e;
	private ProductController pc;
	private EmployeeController ec;
	private OrderController oc;
	private OrderContainer oC;
	
	@BeforeEach
	void setUp() throws Exception {
		this.cc = new CustomerController();
		this.e = new Employee("1204890000", "Bo Billy", "", 88888887, "Bo@Billigt.dk", "kodeord321");
		this.pc = new ProductController();
		this.ec = new EmployeeController();
		this.oc = new OrderController();
		this.oC = OrderContainer.getInstance();
		
		this.ec.setCurrentEmployee(e);
		this.oc.setEmployeeController(ec);
		this.pc.addProduct(4444, "Hammer", "Bahco", 75, 10, 100);
		this.cc.addBusinessCustomer(12345678, "Pepsi Cola", "Hele Verdens gade 42, Danmark, 9440 Aabybro",
				"DK12345678", "Pepsi Man", 87654321, "Pepsi@Cool.com");
		this.cc.addPrivateCustomer("5555554444", "Ip Skrå", "Skæve Kløftens Vej 1, Danmark, 9600 Aars",
				77777771, "OpAd@Bakke.uk");
		
	}
	
	/**
	 * Tests if the OrderController has no currentOrder by default, 
	 * and that it after createOrder has a currentOrder with the correct
	 * employee and has a LocalDateTime datatype object as its dateTime field.
	 */
	@Test
	void createOrderTest() {
		assertEquals(null, oc.getCurrentOrder());
		Order theOrder = oc.createOrder();
		assertEquals(e, theOrder.getEmployee());
		assertEquals("java.time.LocalDateTime", theOrder.getDateTime().getClass().getName());
		Order theOtherOrder = oc.createOrder();
		assertEquals(theOrder, theOtherOrder); // tests that you can't create multiple orders at once.
	}
	
	/**
	 * Tests if the addProduct method creates an OrderLine with the correct values,
	 * and adds that to the Order. We check that the prices are calculated correctly.
	 * To be able to run the test, we use the method createOrder first.
	 */
	@Test
	void addProductTest() {
		Order theOrder = oc.createOrder();
		assertEquals(0, theOrder.getOrderLines().size());
		OrderLine theOrderLine = oc.addProduct(4444, 10);
		assertEquals(750, theOrderLine.getSubTotal());
		assertEquals(1, theOrder.getOrderLines().size());
		assertEquals(750, theOrder.getNetTotal());
		assertEquals(187.5, theOrder.getVatTotal());
		OrderLine theOtherOrderLine = oc.addProduct(4444, 4);
		assertEquals(300, theOtherOrderLine.getSubTotal());
		assertEquals(2, theOrder.getOrderLines().size());
		assertEquals(1050, theOrder.getNetTotal());
		assertEquals(262.5, theOrder.getVatTotal());
	}

	@Test
	void findCustomerByIDTest() {
		Order theOrder = oc.createOrder();
		assertEquals(null, theOrder.getCustomer());
		Customer theCustomer = oc.findCustomerByID(1);
		assertEquals(theCustomer, theOrder.getCustomer());
	}
	
	@Test
	void endOrderTest() {
		oc.endOrder(); // end order before one is even created - should fail
		assertEquals(0, oC.getOrders().size());
		Order theOrder = oc.createOrder();
		oc.endOrder(); // end order before any OrderLines or Customer are associated - should fail
		assertEquals(0, oC.getOrders().size());
		oc.addProduct(4444, 10);
		oc.endOrder(); // end order before Customer is found - should fail
		assertEquals(0, oC.getOrders().size());
		oc.findCustomerByID(1);
		oc.endOrder(); // end order after its filled out - should succeed
		assertEquals(1, oC.getOrders().size());
		
	}
}
