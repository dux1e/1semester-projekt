package controller;
import model.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrderControllerTest {
	private Customer c;
	private Employee e;
	private ProductController pc;
	private EmployeeController ec;
	private OrderController oc;
	
	@BeforeEach
	void setUp() throws Exception {
		this.c = new BusinessCustomer(12345678, "Hele Verdens gade 42, Danmark, 9440 Aabybro", 
				"Pepsi Cola", "Pepsi Man", 87654321, "Pepsi@Cool.com");
		this.e = new Employee(1204890000, "Bo Billy", 88888887, "Bo@Billigt.dk", "kodeord321");
		this.pc = new ProductController();
		this.ec = new EmployeeController();
		this.oc = new OrderController();
		
		this.ec.setCurrentEmployee(e);
		this.oc.setEmployeeController(ec);
		this.pc.addProduct(4444, "Hammer", "Bahco", 75, 10, 100);
		
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
		assertTrue(theOrder.getDateTime().getClass().getName() == "java.time.LocalDateTime");
	}
	
	/**
	 * Tests if the addProduct method creates an OrderLine with the correct values,
	 * and adds that to the Order. We check that the prices are calculated correctly.
	 * To be able to run the test, we use the method createOrder first.
	 */
	@Test
	void addProductTest() {
		Order theOrder = oc.createOrder();
		assertTrue(theOrder.getOrderLines().size() == 0);
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

}
