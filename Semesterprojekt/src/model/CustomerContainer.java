package model;
import java.util.*; //Kun til valg af forskaelige lister

/**
 * Singelton class whose purpose is to create a container to hold Customer objects
 * 
 * @author Gruppe 5
 *
 */
public class CustomerContainer {
	private static CustomerContainer instance;
	private List<Customer> customers; 
	private int nextID;
	
	private CustomerContainer() {
		this.customers = new ArrayList<>();
		this.nextID = 1; // id starts at 1.
	}
	
	public static CustomerContainer getInstance() {
		if(instance == null) {
			instance = new CustomerContainer();
		}
		return instance;
	}
	
	public void addCustomer(Customer customer) {
		customer.setID(this.nextID);
		this.nextID++;
		customers.add(customer);
	}

	public Customer findCustomerByID(int id) {
		int index = 0;
		boolean found = false;
		Customer customer = null;
		while(!found && index < customers.size()) {
			Customer current = customers.get(index);
			if(current.getID() == id) {
				found = true;
				customer = current;
			} else {
				index++;
			}
		}
		return customer;
	}
	
	public ArrayList<Listable> searchViaInput(String input) {
		ArrayList<Listable> matches = new ArrayList<>();
		for(Customer customer : customers) {
			String name = customer.getName();
			String telephoneNo = String.valueOf(customer.getTelephoneNo());
			String uniqueNo = customer.getUniqueNo();
			boolean aNameMatch = doesStringContainString(name, input);
			boolean aTelephoneNoMatch = doesStringContainString(telephoneNo, input);
			boolean aUniqueNoMatch = doesStringContainString(uniqueNo, input);
			boolean aMatch = aNameMatch || aTelephoneNoMatch || aUniqueNoMatch;
			if(aMatch) {
				matches.add(customer);
			}
		}
		return matches;
	}
	
	private boolean doesStringContainString(String haystack, String needle) {
		haystack = haystack.trim().toLowerCase();
		needle = needle.trim().toLowerCase();
		return haystack.contains(needle);
	}
}
