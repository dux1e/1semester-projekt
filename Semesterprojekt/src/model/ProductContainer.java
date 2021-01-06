package model;
import java.util.*; //Kun til valg af forskaelige lister

/**
 * Singelton class whose purpose is to create a container to hold Product object
 * 
 * @author Gruppe 5
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
	
	public ArrayList<Listable> searchViaInput(String input) {
		ArrayList<Listable> matches = new ArrayList<>();
		for(Product product : products) {
			String description = product.getDescription();
			String barcode = String.valueOf(product.getBarcode());
			boolean aDescriptionMatch = doesStringContainString(description, input);
			boolean aBarcodeMatch = doesStringContainString(barcode, input);
			boolean aMatch = aDescriptionMatch || aBarcodeMatch;
			if(aMatch) {
				matches.add(product);
			}
		}
		return matches;
	}
	
	private boolean doesStringContainString(String haystack, String needle) {
		haystack = haystack.trim().toLowerCase();
		needle = needle.trim().toLowerCase();
		return haystack.contains(needle);
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
