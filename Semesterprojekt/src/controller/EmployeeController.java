package controller;
import model.*;



public class EmployeeController {
	private EmployeeContainer employeeContainer;
	private Employee curentEmployee;
	
	public EmployeeController() {
		employeeContainer = EmployeeContainer.getInstance();
	}
	
	public Employee getCurrentEmployee() {
		return curentEmployee;
	}
	
	public void setCurrentEmployee(Employee e) {
		this.curentEmployee = e;
	}
}
