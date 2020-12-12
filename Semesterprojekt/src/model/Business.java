package model;

public abstract class Business {
	private int id;
	private int CVR;
	private String address;
	private String vatRegistrationNo;
	private String name;
	private String contactName;
	private int contactTelephoneNo;
	private String contactEmail;
	
	public Business(int cvr, String name, String address, String vatRe,
			String contactName, int contactTlf, String contactEmail) {
		this.id = 0;
		this.CVR = cvr;
		this.name = name;
		this.address = address;
		this.vatRegistrationNo = vatRe;
		this.contactName = contactName;
		this.contactTelephoneNo = contactTlf;
		this.contactEmail = contactEmail;
	}
	
	// getters and setters below
	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

	public int getCVR() {
		return CVR;
	}

	public void setCVR(int cVR) {
		CVR = cVR;
	}

	public String getVatRegistrationNo() {
		return vatRegistrationNo;
	}

	public void setVatRegistrationNo(String vatRegistrationNo) {
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
