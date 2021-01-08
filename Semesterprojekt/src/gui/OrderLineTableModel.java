package gui;

import java.util.ArrayList;
import java.util.List;
import model.OrderLine;

import javax.swing.table.DefaultTableModel;

public class OrderLineTableModel extends DefaultTableModel{
	private static final long serialVersionUID = 1L;
	private List<OrderLine> data = new ArrayList<>();
	private static final String[] NAMES = {"Beskrivelse", "Antal", "Pris", "Rabat", "Total"};
	
	public OrderLineTableModel() {
		data = new ArrayList<>();
	}
	
	public void setData(List<OrderLine> orderLines) {
		this.data = orderLines;
		super.fireTableDataChanged();
	}
	
	@Override
	public String getColumnName(int col) {
		return NAMES[col];
	}
	
	@Override
	public int getRowCount() { 
		return (data == null ? 0 :  data.size());
	}
 	
	@Override
	public int getColumnCount() {
		return NAMES.length;
	}
	
	public String getValueAt(int row, int col) {
		OrderLine currOl = data.get(row);
		switch(col) {
		case 0: return currOl.getProduct().getDescription();
		case 1: return String.valueOf(currOl.getQuantity());
		case 2: return String.valueOf(currOl.getProduct().getCatalogPrice());
		case 3: return String.valueOf(currOl.getTotalDiscount());
		case 4: return String.valueOf(currOl.getSubTotal());
		default: return "FOO-BAR";
		}
	}

	public OrderLine getOrderLine(int row) {
		return data.get(row);
	}
}
