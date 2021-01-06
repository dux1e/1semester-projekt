package model;

public class PrivateCustomer extends PrivatePerson implements Customer, Listable {
	private double discountMin;
	private double discountMax;
	private double credit;
	
	public PrivateCustomer(String CPR, String name, String address, int tlf, String email) {
		super(CPR, name, address, tlf, email);
		discountMin = 10.0;
		discountMax = 30.0;
		credit = 20000.0;
	}
	
	public String getStringToList() {
		String name = this.getName();
		String telephone = String.valueOf(this.getTelephoneNo());
		String id = String.valueOf(this.getID());
		String theString = "P:   " + name + " - " + telephone + " - " + id;
		return theString;
	}
	
	// getters and setters below
	public double getDiscountMin() {
		return discountMin;
	}

	public void setDiscountMin(double discountMin) {
		this.discountMin = discountMin;
	}

	public double getDiscountMax() {
		return discountMax;
	}

	public void setDiscountMax(double discountMax) {
		this.discountMax = discountMax;
	}

	public double getCredit() {
		return credit;
	}

	public void setCredit(double credit) {
		this.credit = credit;
	}

}
