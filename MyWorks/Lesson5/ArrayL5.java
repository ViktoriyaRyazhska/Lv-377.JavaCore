package Lesson5;

import java.util.Arrays;

public class ArrayL5 {

	public static void main(String[] args) {
		int digits[] = { 31, -28, 22, -3, 75, 55, 880, 44, 13, 26 };
		int max = digits[0];
		int imax = 0;
		int i = 0;
		while (i < digits.length) {
			if (digits[i] > max) {
				max = digits[i];
				imax = i;
			}
			i++;
		}
		System.out.print("Maximum = " + max);
		////////////////////////////////////////////////////////
		int sum = 0;
		for (int j = 0; j < digits.length; j++) {
			sum += digits[j];
		}
		System.out.println();

		System.out.println("Sum = " + sum);
		////////////////////////////////////////////////////////

		int sumN = 0;
		for (int k = 0; k < digits.length; k++) {
			if (digits[k] < 0) {
				sumN += digits[k];
			}
		}
		System.out.println(sumN);
/////////////////////////////////////////////
		
		int tmp;
		for (int l = 0; l < digits.length - 1; l++) {
			for (int m = i + 1; m < digits.length; m++) {
				if (digits[l] < digits[m]) {
					tmp = digits[l];
					digits[l] = digits[m];
					digits[m] = tmp;
				}
			}
		}
		for (int l = 0; l < digits.length; l++) {
			System.out.println(digits[l]);
		}

	}

}
