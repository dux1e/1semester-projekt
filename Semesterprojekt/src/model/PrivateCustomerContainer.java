package model;
import java.util.*; //Kun til valg af forskællige lister

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

}
