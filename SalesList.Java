package lederer;

import java.util.ArrayList;

public class SalesList {

//data member 
	private ArrayList<SalesItem> allItems;
	
//constructor 
	public SalesList() {
		allItems = new ArrayList<SalesItem>();
	}
	
//functionality 
	public void addNewItem(SalesItem salesItem) {
		allItems.add(salesItem);
	}
	
	public String getSalesList() {
		String str = "";
		for (int i = 0; i < allItems.size(); i++) {
			str += allItems.get(i).toString() + "\n";
		}
		return str;
	}
	
	public double computeTotalAmount() {
		double totalAmount = 0;
		for (int i = 0; i < allItems.size(); i++) {
			totalAmount += allItems.get(i).getTotal();
		}
		return totalAmount;
	}
}
