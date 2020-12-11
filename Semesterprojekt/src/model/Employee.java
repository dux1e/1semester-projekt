package model;

public class Employee extends PrivatePerson {
	private int regNo;
	private int accountNo;
	private String Position;
	private String password;
	
	public Employee(int CPR, String name, int tlf, String email, String password) {
		super(CPR, name, tlf, email);
		this.password = password;
	}

	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getPosition() {
		return Position;
	}

	public void setPosition(String position) {
		Position = position;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
