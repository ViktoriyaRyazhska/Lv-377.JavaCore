package Lesson4;

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

	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public static void main(String[] args) {
		Product p1 = new Product("milk", 19.8, 25);
		Product p2 = new Product("sugar", 116.2, 40);
		Product p3 = new Product("candy", 98.25, 30);
		Product p4 = new Product("bread", 10.25, 50);

		if ((p1.getPrice() > p2.getPrice()) && (p1.getPrice() > p3.getPrice())
				&& (p1.getPrice() > p4.getPrice())) {
			System.out.println("the name of the most expensive product " + p1.getName() + " has quantity " + p1.getQuantity());
		}
		else if ((p2.getPrice() > p1.getPrice()) && (p2.getPrice() > p3.getPrice()) 
				&& (p2.getPrice() > p4.getPrice())) {
			System.out.println("the name of the most expensive product " + p2.getName() + " has quantity " + p2.getQuantity());
		}
		else if ((p3.getPrice() > p1.getPrice()) && (p3.getPrice() > p2.getPrice()) 
				&& (p3.getPrice() > p4.getPrice())) {
			System.out.println("the name of the most expensive product " + p3.getName() + " has quantity " + p3.getQuantity());
		}
		else if ((p4.getPrice() > p1.getPrice()) && (p4.getPrice() > p2.getPrice()) 
				&& (p4.getPrice() > p3.getPrice())) {
			System.out.println("the name of the most expensive product " + p4.getName() + " has quantity " + p4.getQuantity());
		}
		
		if((p1.getQuantity()>p2.getQuantity())&&(p1.getQuantity()>p3.getQuantity())
				&&(p1.getQuantity()>p2.getQuantity())) {
			System.out.println("Product name "+p1.getName()+ " has the largest quantity "+p1.getQuantity()+" pcs");
		}
		else if((p2.getQuantity()>p1.getQuantity())&&(p2.getQuantity()>p3.getQuantity())
				&&(p2.getQuantity()>p4.getQuantity())) {
			System.out.println("Product name "+p2.getName()+ " has the largest quantity "+p2.getQuantity()+" pcs");
		}
		else if((p3.getQuantity()>p1.getQuantity())&&(p3.getQuantity()>p2.getQuantity())
				&&(p3.getQuantity()>p4.getQuantity())) {
			System.out.println("Product name "+p3.getName()+ " has the largest quantity "+p3.getQuantity()+" pcs");
		}
		else if((p4.getQuantity()>p1.getQuantity())&&(p4.getQuantity()>p2.getQuantity())
				&&(p4.getQuantity()>p3.getQuantity())) {
			System.out.println("Product name "+p4.getName()+ " has the largest quantity "+p4.getQuantity()+" pcs");
		}

	}

}
