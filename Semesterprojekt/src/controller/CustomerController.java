package controller;
import model.*;

public class CustomerController {
    public CustomerContainer customerContainer;
	
	public CustomerController() {
		customerContainer = CustomerContainer.getInstance();
	}
	
	public Customer findCustomerByID(int id) {
		return null;
	}
}
