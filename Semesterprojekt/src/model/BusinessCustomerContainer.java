package model;
import java.util.*; //Kun til valg af forskællige lister

/**
 * Singelton class whose purpose is to create a container to hold BusinessCustomer object
 * 
 * @author Joakim
 *
 */
public class BusinessCustomerContainer {
	private static BusinessCustomerContainer instance;
	private List<BusinessCustomer> businessCustomers;
	
	private BusinessCustomerContainer() {
		businessCustomers = new ArrayList<>();
	}
	
	public static BusinessCustomerContainer getInstance() {
		if(instance == null) {
			instance = new BusinessCustomerContainer();
		}
		return instance;
	}
	
	public void addBusinessCustomer(BusinessCustomer businessCustomer) {
		businessCustomers.add(businessCustomer);
	}

}
