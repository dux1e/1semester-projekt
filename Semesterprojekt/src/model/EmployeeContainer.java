package model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeContainer {
	private static EmployeeContainer instance;
	private List<Employee> employees;
	
	private EmployeeContainer() {
		employees = new ArrayList<>();
	}
	
	public static EmployeeContainer getInstance() {
		if(instance == null) {
			instance = new EmployeeContainer();
		}
		return instance;
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public Employee findEmployeeByID(int id) {
		return null;
	}
}
