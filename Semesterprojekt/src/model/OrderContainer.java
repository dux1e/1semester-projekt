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
	
	private OrderContainer() {
		orders = new ArrayList<>();
	}
	
	public static OrderContainer getInstance() {
		if(instance == null) {
			instance = new OrderContainer();
		}
		return instance;
	}
	
	public void addOrder(Order order) {
		orders.add(order);
	}

}
