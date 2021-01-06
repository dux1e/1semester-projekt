package model;

public interface Customer extends Listable {
	public int getID();
	public void setID(int id);
	public String getName();
	public int getTelephoneNo();
	public String getUniqueNo();
}
