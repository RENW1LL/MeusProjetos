package entities;

public class Products {

	public String name;
	public int quantity;
	public double price;
	
	public double totalValueInStock() {
		return quantity * price;
		
	}
		
	public void addProducts(int quantity) {
		this.quantity += quantity;
		
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name 
				+ ", R$"
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, total: R$"
				+ String.format("%.2f", totalValueInStock());
	} 
}
