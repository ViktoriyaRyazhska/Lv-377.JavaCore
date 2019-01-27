import java.util.Scanner;

public class HW5 {
	private int nMonth;

	public int inPut(Scanner in) {
		System.out.println("Inpunt month number");
		nMonth = in.nextInt();
		return nMonth;
	}

	public void Array() {
		int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		System.out.print("This month has " + months[nMonth - 1]);
	}

	public void pozitiv() {
		int[] numb = { 3, 5, 4, 7, 10, 6, 20, -16, 4, 33 };
		int i = 0;
		int sum = 0;
		int sum1 = 0;
		for (i = 0; i < 5; i++) {
			if (numb[i] > 0) {
				sum += numb[i];
			} else {
				sum = 0;
			}

		}

		System.out.println(sum);

		for (i = 5; i < numb.length; i++) {
			sum1 += numb[i];
		}
		System.out.println(sum1);
	}

	public void secondNumber(Scanner in) {
		int[] m = new int[5];
		int j = 0;
		int eve = 0;
		int min = m[0];
		int imin = 0;
		for (int i = 0; i < m.length; i++) {
			System.out.println("Input " + (i + 1) + " number");
			m[i] = in.nextInt();
			if (m[i] < 0) {
				break;
			}
			if (m[i] % 2 == 0) {
				eve++;
			}
		}
		System.out.println("Even numbers" + eve);
		for (int i = 0; i < m.length; i++) {
			if (m[i] > 0) {
				j++;
			}
			if (m[i] > 0 && j == 2) {
				System.out.println(" Position of second number is" + (i + 1));
			}
		}

		for (int i = 0; i < m.length; i++) {
			if (m[i] < min) {
				min = m[i];
				imin = i;
			}
		}
		System.out.println("Minimum= " + min + " his place " + (imin + 1));

	}

}
