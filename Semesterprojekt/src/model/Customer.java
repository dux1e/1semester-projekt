package model;

public interface Customer extends Listable {
	public int getID();
	
	public void setID(int id);
	public void setDiscountMin(double discountMin);
	public void setDiscountMax(double discountMax);
	public void setCredit(double credit);
	
	public String getName();
	public int getTelephoneNo();
	public String getUniqueNo();
}
