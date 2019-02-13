import java.util.Scanner;

public class Task7 {
	public static int factorial1() throws Exception {
		int n = 0;
		int p = 1;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n");
		try {
			n = in.nextInt();
		} catch (Exception e) {
			System.out.println("Wrong, It's not number");
		}
		for (int i = 1; i <= n; i++) {
			p *= i;

		}
		return p;
	}

}
