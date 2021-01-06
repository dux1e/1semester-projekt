package controller;
import java.util.ArrayList;

import model.*;

public class CustomerController {
    public CustomerContainer customerContainer;
	
	public CustomerController() {
		customerContainer = CustomerContainer.getInstance();
	}
	
	public Customer addBusinessCustomer(int cvr, String name, String address, String vatRe,
			String contactName, int contactTlf, String contactEmail) {
		Customer c = new BusinessCustomer(cvr, name, address, vatRe, contactName, contactTlf, contactEmail);
		this.customerContainer.addCustomer(c);
		return c;
	}
	
	public Customer addPrivateCustomer(String CPR, String name, String address, int tlf, String email) {
		Customer c = new PrivateCustomer(CPR, name, address, tlf, email);
		this.customerContainer.addCustomer(c);
		return c;
	}
	
	public Customer findCustomerByID(int id) {
		Customer c = this.customerContainer.findCustomerByID(id);
		return c;
	}
	
	public ArrayList<Listable> searchViaInput(String input) {
		return customerContainer.searchViaInput(input);
	}
}
