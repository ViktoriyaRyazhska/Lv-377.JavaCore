package Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Numbers5 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array length");
		int[] array = new int[Integer.parseInt(br.readLine())];
		System.out.println("Enter all elements in array");

		// ------------product of all entered even numbers-------------------------------//
		int product = 1;
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(br.readLine());
			if (array[i] % 2 == 0) {
				product = product * array[i];
			}
		}
		System.out.println("Product = " + product);
		System.out.println();
		System.out.println(Arrays.toString(array));
		System.out.println();

		// ------------position of second positive number------------------------//
		for (int j = 0; j < array.length; j++)
			if (array[j] > 0) {
				System.out.println("This number is positive, its position " + (j + 1));
			}
		// ------------minimum and its position in the array------------------------//

		for (int k = 0; k < array.length; k++)
			if (array[k] < 0) {
				break;
			}

		int min = array[0];
		int imin = 0;
		int m = 0;
		while (m < array.length) {
			if (array[m] < min) {
				min = array[m];
				imin = m;
			}
			m++;
		}
		System.out.println();
		System.out.print("Minimum = " + min);
		System.out.println(" is in " + (imin + 1) + " place");
		// ------------------------------------//

	}

}
// Enter 5 integer numbers.
// Find position of second positive number;
// minimum and its position in the array.
// Organize entering integers until the first negative number.
// Count the product of all entered even numbers.