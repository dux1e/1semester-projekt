package controller;
import model.*;

public class CustomerController {
    public CustomerContainer customerContainer;
	
	public CustomerController() {
		customerContainer = CustomerContainer.getInstance();
	}
	
	public Customer findCustomerByID(int id) {
		Customer c = this.customerContainer.findCustomerByID(id);
		return c;
	}
}
