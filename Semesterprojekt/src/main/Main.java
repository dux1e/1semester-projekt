package main;

import controller.*;
import model.*;
import tui.MainUI;


public class Main {

	public static void main(String[] args) {
		// opretter oplysninger
		CustomerController cc = new CustomerController();
		Employee e = new Employee("1204890000", "Bo Billy", "", 88888887, "Bo@Billigt.dk", "kodeord321");
		ProductController pc = new ProductController();
		EmployeeController ec = new EmployeeController();
		OrderController oc = new OrderController();
		
		ec.setCurrentEmployee(e);
		oc.setEmployeeController(ec);
		pc.addProduct(4444, "Hammer", "Bahco", 75, 25, 10, 100);
		cc.addBusinessCustomer(12345678, "Pepsi Cola", "Hele Verdens gade 42, Danmark, 9440 Aabybro",
				"DK12345678", "Pepsi Man", 87654321, "Pepsi@Cool.com");
		cc.addPrivateCustomer("5555554444", "Ip Skrå", "Skæve Kløftens Vej 1, Danmark, 9600 Aars",
				77777771, "OpAd@Bakke.uk");
		
		
		//starter TUI
		MainUI.start();
	}

}
