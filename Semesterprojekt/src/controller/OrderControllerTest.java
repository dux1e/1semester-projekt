package controller;
import model.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrderControllerTest {
	private Customer c;
	private Employee e;
	private Product p;
	
	@BeforeEach
	void setUp() throws Exception {
		this.c = new BusinessCustomer(12345678, "Hele Verdens gade 42, Danmark, 9440 Aabybro", "Pepsi Cola", "Pepsi Man", 87654321, "Pepsi@Cool.com");
		this.e = new Employee(1204890000, "Bo Billy", 88888887, "Bo@Billigt.dk", "kodeord321");
		this.p = new Product(4444, "Hammer", "Bahco", 75, 10, 100);
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
