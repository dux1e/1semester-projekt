package model;
import java.util.*; //Kun til valg af forskællige lister

/**
 * Singelton class whose purpose is to create a container to hold Product object
 * 
 * @author Joakim
 *
 */
public class ProductContainer {
	private static ProductContainer instance;
	private List<Product> products; 
	
	private ProductContainer() {
		products = new ArrayList<>(); 
	}
	
	public static ProductContainer getInstance() {
		if(instance == null) {
			instance = new ProductContainer();
		}
		return instance;
	}
	
	public void addProduct(Product product) {
		products.add(product);
		
	}
	
	
}
