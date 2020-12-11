package model;

public class BusinessCustomer extends Business{
	private double discountMin;
	private double discountMax;
	private double credit;
	
	public BusinessCustomer(int cvr, String contactName, int contactTlf, String contactEmail) {
		super(cvr, contactName, contactTlf, contactEmail);
	}
	
	public int getID() {
		return super.getID();
	}
}
