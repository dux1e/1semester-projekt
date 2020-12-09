package model;

public class Employee extends PrivatePerson {
	private int regNo;
	private int accountNo;
	private String Position;
	
	public Employee(int CPR, int tlf, String email) {
		super(CPR, tlf, email);
	}

}
