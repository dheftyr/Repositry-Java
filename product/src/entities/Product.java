package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	public double sum() {
		
		double total;
		
		total = quantity * price;
		
		return total;
	}
	
	public void addProduct(int unit) {
		quantity += unit;
	}
	
	public void removeProduct(int unit) {
		quantity -= unit;
	}
	
	public String toString() {
		return"Product data: "
			+ name
			+ ", $ "
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, total: "
			+ String.format("%.2f", sum());
		}
}
	
