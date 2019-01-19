import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FiveIntNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		final int length = 5;
		final int maxInt = 2147483647;
		int[] array = new int[length];
		int min = maxInt;
		int index = -1;
		int product = 1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Please, enter 5 positive numbers.");
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter number " + i + ": ");
			int number = Integer.parseInt(br.readLine());
			
			if (number < 0) {
				System.out.println("You have entered the negative number.");
				break;				
			} else {
				if (number < min) {
					min = number;
					index = i;
				}
				product *= number;
			}
		}
		
		if (min != maxInt) {
			System.out.println("min = " + min + ", position = " + index);
			System.out.println("product = " + product);
		}
	}

}
