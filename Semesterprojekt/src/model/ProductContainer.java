package model;
import java.util.*; //Kun til valg af forskaelige lister

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

	public Product findProductByBarcode(int barcode) {
		int index = 0;
		boolean found = false;
		Product product = null;
		while(!found && index < products.size()) {
			product = products.get(index);
			if(product.getBarcode() == barcode) {
				found = true;
			} else {
				index++;
			}
		}
		if(found) {
			return product;
		} else {
			return null;
		}
	}
	
	//Anden version er søgeloopet ovenover
	/*public Product findProduct(int barcode) {
		int index = 0;
		boolean found = false;
		Product product = null;
		while(!found && index < products.size()) {
			product = products.get(index);
			if(product.getBarcode() == barcode) {
				found = true;
			} else {
				index++;
			}
		}
		if(!found) {
			product = null;
		}
		return product;
	}*/
	
	
}
