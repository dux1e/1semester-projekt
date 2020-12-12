package model;

public class BusinessCustomer extends Business implements Customer {
	private double discountMin;
	private double discountMax;
	private double credit;
	
	public BusinessCustomer(int cvr, String name, String address, String vatRe,
			String contactName, int contactTlf, String contactEmail) {
		super(cvr, name, address, vatRe, contactName, contactTlf, contactEmail);
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
