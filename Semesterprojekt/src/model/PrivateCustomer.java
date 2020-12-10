package model;

public class PrivateCustomer extends PrivatePerson {
	private double discountMin;
	private double discountMax;
	private double credit;
	
	public PrivateCustomer(int CPR, int tlf, String email) {
		super(CPR, tlf, email);
	}

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
