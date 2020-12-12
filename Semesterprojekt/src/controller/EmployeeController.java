package controller;
import model.*;



public class EmployeeController {
	private Employee curentEmployee;
	
	public EmployeeController() {
		EmployeeContainer.getInstance();
	}
	
	public Employee getCurrentEmployee() {
		return curentEmployee;
	}
	
	public void setCurrentEmployee(Employee e) {
		this.curentEmployee = e;
	}
}
