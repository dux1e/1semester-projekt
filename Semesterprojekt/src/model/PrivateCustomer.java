package model;

public class PrivateCustomer extends PrivatePerson {
	private double discountMin;
	private double discountMax;
	private double credit;
	
	public PrivateCustomer(int CPR, int tlf, String email) {
		super(CPR, tlf, email);
	}

}
