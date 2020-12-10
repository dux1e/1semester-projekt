package model;

public abstract class PrivatePerson {
	private int ID;
	private int telephoneNo;
	private String name;
	private String email;
	
	private final int CPR;
	
	public PrivatePerson(int CPR, int tlf, String email) {
		this.CPR = CPR;
		telephoneNo = tlf;
		this.email = email;
	}
	
	
	// Herunder er der kun getter og setter
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

	public int getCPR() {
		return CPR;
	}
	
	
	

}