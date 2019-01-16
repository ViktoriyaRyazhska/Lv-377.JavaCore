package product;

public class Main {

	public static void main(String[] args) {

		Product pr1 = new Product("apple", 25, 40);
		Product pr2 = new Product("orange", 40, 15);
		Product pr3 = new Product("cherry", 5, 120);
		Product pr4 = new Product("banana", 30, 10);
		
		if(pr1.getPrice() > pr2.getPrice() && pr1.getPrice() > pr3.getPrice() && pr1.getPrice() > pr4.getPrice()) {
			System.out.println("The most expensive item is : " + " " + pr1.getName() + " " + pr1.getCount());
		}else if(pr2.getPrice() > pr1.getPrice() && pr2.getPrice() > pr3.getPrice() && pr2.getPrice() > pr4.getPrice()){
			System.out.println("The most expensive item is : " + " " + pr2.getName() + " " + pr2.getCount());
		}else if(pr3.getPrice() > pr1.getPrice() && pr3.getPrice() > pr3.getPrice() && pr2.getPrice() > pr4.getPrice()){
			System.out.println("The most expensive item is : " + " " + pr3.getName() + " " + pr3.getCount());
		}else {
			System.out.println("The most expensive item is : " + " " + pr4.getName() + " " + pr4.getCount());
		}
		
		if(pr1.getCount() > pr2.getCount() && pr1.getCount() > pr3.getCount() && pr1.getCount() > pr4.getCount()) {
			System.out.println("The biggest quantity has : " + " " + pr1.getName());
		}else if(pr2.getCount() > pr1.getCount() && pr2.getCount() > pr3.getCount() && pr2.getCount() > pr4.getCount()){
			System.out.println("The biggest quantity has : " + " " + pr2.getName());
		}else if(pr3.getCount() > pr1.getCount() && pr3.getCount() > pr2.getCount() && pr3.getCount() > pr4.getCount()){
			System.out.println("The biggest quantity has : " + " " + pr3.getName());
		}else {
			System.out.println("The biggest quantity has : " + " " + pr4.getName());
		}
	}

}
