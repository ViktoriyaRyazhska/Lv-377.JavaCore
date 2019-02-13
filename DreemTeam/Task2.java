import java.io.EOFException;
import java.util.Scanner;

public class Task2 {
	public static void podil() throws Exception {
		int p = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number");
		try {
			p = in.nextInt();
		} catch (Exception e) {
			System.out.println("Wrong, It's not number");
		}
		for (int i = 2; i <= p; i++) {
			while (p % i == 0) {
				System.out.print(i + "*");
				p /= i;
			}
		}
	}

}
