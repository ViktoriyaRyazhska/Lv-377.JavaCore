import java.util.Scanner;

public class Task1_2_3 {

	public static void main(String[] args) {
/* Task1 */
		double Pi = 3.14;
		Scanner in = new Scanner(System.in);
		System.out.println("Input radius");
		double R = in.nextDouble();
		double S = Pi * Math.pow(R, 2);
		double P = 2 * Pi * R;
		System.out.println(S);
		System.out.println(P);
/* Task2 */
		String name;
		String address;
		System.out.println("What is your name?");
		name = in.next();
		System.out.println("Where are you live," + name);
		address = in.next();
		System.out.println("Your name is " + name + " and you live in " + address);
/* Task3 */
		double c1, c2, c3, t1, t2, t3;
		System.out.println("Enter a price for a phone call c1");
		c1 = in.nextDouble();
		System.out.println("Enter a price for a phone call c2");
		c2 = in.nextDouble();
		System.out.println("Enter a price for a phone call c3");
		c3 = in.nextDouble();
		System.out.println("Enter duration t1");
		t1 = in.nextDouble();
		System.out.println("Enter duration t2");
		t2 = in.nextDouble();
		System.out.println("Enter duration t3");
		t3 = in.nextDouble();

		double price_c1 = c1 * t1;
		double price_c2 = c2 * t2;
		double price_c3 = c3 * t3;
		double totalPrice = price_c1 + price_c2 + price_c3;
		System.out.println(" Call 1 = "+price_c1);
        System.out.println(" Call 2 = "+price_c2);
        System.out.println(" Call 3 = "+price_c3);
        System.out.println("Total price = "+totalPrice);
	}

}
