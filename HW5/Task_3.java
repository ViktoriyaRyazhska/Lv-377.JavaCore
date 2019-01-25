package HW5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Write integer number " + (i + 1) + ": ");
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int count = 0;
		for (int i = 0; i < 5; i++) {
			if(arr[i] > 0) {
				count++;
				if(count == 2) {
					System.out.println("Second positive number is " + arr[i] + " on position " + (i + 1));
				}
			}	
		}
		
		int min = arr[0];
		int imin = 0;
		int i = 0;
		while (i < arr.length) {
			if (arr[i] < min) {
				min = arr[i];
				imin = i;
			}
			i++;
		}
		System.out.print("Minimum = " + min);
		System.out.println(" is in " + (imin + 1) + " place.");
		
		int n = 1;	
		int j = 0;
		int sum = 0;
		do {
			int[] lis = new int[n];
			System.out.println("Write integer number " + (j + 1) + ": ");
			lis[j] = Integer.parseInt(br.readLine());
			if(lis[j] > 0) {
				n++;
			}
			if(lis[j]%2 == 0) {
				sum += lis[j];
			}
			j++;
		} while (j < n);
		
		System.out.println("Sum = " + sum);
	}
}