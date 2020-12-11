package model;

public abstract class Business {
	private int ID;
	private int CVR;
	private int vatRegistrationNo;
	private int contactTelephoneNo;
	private String name;
	private String contactName;
	private String contactEmail;
	
	public Business(int cvr, String contactName, int contactTlf, String contactEmail) {
		this.CVR = cvr;
		this.contactName = contactName;
		this.contactTelephoneNo = contactTlf;
		this.contactEmail = contactEmail;
	}
	
	public int getID() {
		return ID;
	}
}
