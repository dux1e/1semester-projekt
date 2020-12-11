package model;

public abstract class Business {
	private int ID;
	private int CVR;
	private int vatRegistrationNo;
	private int contactTelephoneNo;
	private String name;
	private String contactName;
	private String contactEmail;
	
	public Business(int cvr, String name, String contactName, int contactTlf, String contactEmail) {
		this.CVR = cvr;
		this.name = name;
		this.contactName = contactName;
		this.contactTelephoneNo = contactTlf;
		this.contactEmail = contactEmail;
	}
	
	// getters and setters below
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getCVR() {
		return CVR;
	}

	public void setCVR(int cVR) {
		CVR = cVR;
	}

	public int getVatRegistrationNo() {
		return vatRegistrationNo;
	}

	public void setVatRegistrationNo(int vatRegistrationNo) {
		this.vatRegistrationNo = vatRegistrationNo;
	}

	public int getContactTelephoneNo() {
		return contactTelephoneNo;
	}

	public void setContactTelephoneNo(int contactTelephoneNo) {
		this.contactTelephoneNo = contactTelephoneNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
}
