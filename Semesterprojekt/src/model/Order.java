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
	
	// getters and setters below
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	
	public String getProject() {
		return project;
	}
	
	public void setProject(String project) {
		this.project = project;
	}
	
	public double getVatTotal() {
		return vatTotal;
	}
	
	public void setVatTotal(double vatTotal) {
		this.vatTotal = vatTotal;
	}
	
	public double getNetTotal() {
		return netTotal;
	}
	
	public void setNetTotal(double netTotal) {
		this.netTotal = netTotal;
	}
	
	public List<OrderLine> getOrderLines() {
		return orderLines;
	}
	
	public void setOrderLines(List<OrderLine> orderLines) {
		this.orderLines = orderLines;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	

}
