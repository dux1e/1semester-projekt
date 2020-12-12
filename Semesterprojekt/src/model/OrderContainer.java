package model;
import java.util.*; //Kun til valg af forskællige lister

/**
 * Singelton class whose purpose is to create a container to hold Order object
 * 
 * @author Joakim
 *
 */
public class OrderContainer {
	private static OrderContainer instance;
	private List<Order> orders;
	private int nextOrderNo;
	
	private OrderContainer() {
		this.orders = new ArrayList<>();
		this.nextOrderNo = 1; // orderNo 0 is reserved for cash customer
	}
	
	public static OrderContainer getInstance() {
		if(instance == null) {
			instance = new OrderContainer();
		}
		return instance;
	}
	
	public void addOrder(Order order) {
		order.setOrderNo(this.nextOrderNo);
		this.nextOrderNo++;
		orders.add(order);
	}
	
	public Order findOrderByOrderNo(int orderNo) {
		int index = 0;
		boolean found = false;
		Order order = null;
		while(!found && index < orders.size()) {
			order = orders.get(index);
			if(order.getOrderNo() == orderNo) {
				found = true;
			} else {
				index++;
		    }
		}
		if(found) {
			return order;
		} else {
			return null;
		}
	}

	// getters and setters below
	public List<Order> getOrders() {
		return orders;
	}
}
