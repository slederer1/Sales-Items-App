package lederer;

public class SalesItem {

//data members 
	private String item;
	private double price; 
	private int quantity;
	
	//constructor 
	public SalesItem(String itemName, int quantity, double price) {
		item = itemName;
		this.quantity = quantity;
		this.price = price;
	}
	
	//getters
	public double getTotal() {
		return quantity * price;
	}
	
	//functionality 
	public String toString() {
		return item + "\t$" + String.format("%.2f", price) + "\t" + quantity;
	}
}
