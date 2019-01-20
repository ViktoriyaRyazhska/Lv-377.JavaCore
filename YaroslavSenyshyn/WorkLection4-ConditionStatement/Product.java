package day3;

public class Product {
	private String name;
	private double price;
	private int quantity;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product (String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	
		
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		Product other = (Product) obj;
//		if (hashCode(Product) == hashCode(other)) return false;
		if (price == other.price) {
			return true;
//			System.out.printf(name, price);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	void print() {
		System.out.println("name " + name);
	}
}
