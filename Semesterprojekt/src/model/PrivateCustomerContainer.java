package model;
import java.util.*; //Kun til valg af forskaelige lister

/**
 * Singelton class whose purpose is to create a container to hold PrivateCustomer object
 * 
 * @author Joakim
 *
 */
public class PrivateCustomerContainer {
	private static PrivateCustomerContainer instance;
	private List<PrivateCustomer> privateCustomers;
	
	private PrivateCustomerContainer() {
		privateCustomers = new ArrayList<>();
	}
	
	public static PrivateCustomerContainer getInstance() {
		if(instance == null) {
			instance = new PrivateCustomerContainer();
		}
		return instance;
	}
	
	public void addPrivateCustomer(PrivateCustomer privateCustomer) {
		privateCustomers.add(privateCustomer);
	}

	public PrivateCustomer findCustomerByCPR(int cpr) {
		int index = 0;
		boolean found = false;
		PrivateCustomer customer = null;
		while(!found && index < privateCustomers.size()) {
			customer = privateCustomers.get(index);
			if(customer.getCPR() == cpr) {
				found = true;
			} else {
				index++;
			}
		}
		if(found) {
			return customer;
		} else {
			return null;
		}
	}
		
	public PrivateCustomer findCustomerByTlf(int tlf) {
		int index = 0;
		boolean found = false;
		PrivateCustomer customer = null;
		while(!found && index < privateCustomers.size()) {
			customer = privateCustomers.get(index);
			if(customer.getTelephoneNo() == tlf) {
				found = true;
			} else {
				index++;
		    }
		}
		if(found) {
			return customer;
		} else {
			return null;
		}
	}
}
