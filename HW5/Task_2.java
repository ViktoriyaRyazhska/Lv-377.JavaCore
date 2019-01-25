package HW5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Write integer number " + (i + 1) + ": ");
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int sum = 0;
		if(arr[0] > 0 && arr[1] > 0 && arr[2] > 0 && arr[3] > 0 && arr[4] > 0) {
			for (int i = 0; i < 5; i++) {
				sum += arr[i];
			}
		}
		else {
			for (int i = 5; i < 10; i++) {
				sum += arr[i];
			}
		}
		
		System.out.println("Sum = " + sum);
	}
}