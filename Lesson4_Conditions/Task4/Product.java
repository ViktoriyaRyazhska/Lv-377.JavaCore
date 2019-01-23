package Lesson4_Conditions.Task4;

public class Product {

	private String name;
	private int quantity;
	private double price;

	public Product(String name, int quantity, double price) {
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

	public Product() {
	}

	public static void main(String[] args) {

		// Create class Product with fields name, price and quantity.
		// Create four instances of type Product.
		// Display the name and quantity of the most expensive item.
		// Display the name of the items, which has the biggest quantity.

		Product[] array = { new Product("Oak table", 34, 1399.99), new Product("Chair `Superman`", 76, 135.99),
				new Product("Mirror 70x90", 12, 79.99), new Product("Sofa `The perfect comfort`", 25, 4599.99) };

		Product expensiveItem = null;
		Product biggestQuantity = null;
		double maxPrice = 0;
		int maxQuantity = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i].getPrice() > maxPrice) {
				maxPrice = array[i].getPrice();
				expensiveItem = array[i];
			}
			if (array[i].getQuantity() > maxQuantity) {
				maxQuantity = array[i].getQuantity();
				biggestQuantity = array[i];
			}
		}
		System.out.println("The bigest price is " + maxPrice + " of the " + expensiveItem.getName());
		System.out.println("The bigest quantity is " + maxQuantity + " of the " + biggestQuantity.getName());

	}

}
