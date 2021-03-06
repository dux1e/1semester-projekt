package model;

public abstract class PrivatePerson {
	private int ID;
	private int telephoneNo;
	private String name;
	private String address;
	private String email;
	
	private final String CPR; // is String because int can't hold such big number.
	
	public PrivatePerson(String CPR, String name, String address, int tlf, String email) {
		this.CPR = CPR;
		this.name = name;
		this.setAddress(address);
		this.telephoneNo = tlf;
		this.email = email;
	}
	
	public String getUniqueNo() {
		String no = this.getCPR();
		return no;
	}
	
	// getters and setters below
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getTelephoneNo() {
		return telephoneNo;
	}

	public void setTelephoneNo(int telephoneNo) {
		this.telephoneNo = telephoneNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCPR() {
		return CPR;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
}
