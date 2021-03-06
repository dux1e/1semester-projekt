package model;
import java.util.*;
import java.time.LocalDateTime;

public class Order {
	private int orderNo;
	private LocalDateTime dateTime;
	private String project;
	private double netTotal;
	private double vatTotal;
	private List<OrderLine> orderLines;
	private Customer customer;
	private Employee employee;
	
	public Order(Employee e) {
		this.orderNo = 0;
		this.dateTime = LocalDateTime.now();
		this.project = null;
		this.netTotal = 0;
		this.vatTotal = 0;
		this.orderLines = new ArrayList<>();
		this.customer = null;
		this.employee = e;
	}
	
	public void addOrderLine(OrderLine ol) {
		orderLines.add(ol);
		calculateTotals();
	}
	
	public double calculateTotals() {
		double total = calculateNetTotal() + calculateVatTotal();
		return total;
	}
	
	private double calculateNetTotal() {
		netTotal = 0;
		for(int i = 0; i < orderLines.size(); i++) {
			netTotal += orderLines.get(i).getSubTotal();
		}
		return netTotal;
	}
	
	private double calculateVatTotal() {
		vatTotal = netTotal * 0.25;
		return vatTotal;
	}
	
	public double calculateDiscount() {
		double totalDiscount = 0.0;
		for(OrderLine ol : orderLines) {
			totalDiscount = totalDiscount + ol.getTotalDiscount();
		}
		return totalDiscount;
	}

	
	// getters and setters below
	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public double getNetTotal() {
		return netTotal;
	}

	public double getVatTotal() {
		return vatTotal;
	}

	public List<OrderLine> getOrderLines() {
		return orderLines;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
