package model;
import java.util.*;

public class Order {
	private int orderNo;
	//private noget med der kommer en dato
	private String project;
	private double vatTotal;
	private double netTotal;
	private List<OrderLine> orderLines;
	private PrivateCustomer privateCustomer;
	//private noget med der kommer en employee
	
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
	
	public PrivateCustomer getPrivateCustomer() {
		return privateCustomer;
	}
	
	public void setPrivateCustomer(PrivateCustomer privateCustomer) {
		this.privateCustomer = privateCustomer;
	}
	

}
