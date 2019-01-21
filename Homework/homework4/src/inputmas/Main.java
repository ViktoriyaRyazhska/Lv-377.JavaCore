package inputmas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int mas[] = new int[5];
		int i = 0;
			System.out.println("input 1 number : ");
			mas[0] = Integer.valueOf(bf.readLine());
			System.out.println("input 2 number : ");
			mas[1] = Integer.valueOf(bf.readLine());
			System.out.println("input 3 number : ");
			mas[2] = Integer.valueOf(bf.readLine());
			System.out.println("input 4 number : ");
			mas[3] = Integer.valueOf(bf.readLine());
			System.out.println("input 5 number : ");
			mas[4] = Integer.valueOf(bf.readLine());
			int product = 1;
		for(i = 0; i < mas.length; i ++) {
			if(mas[i]%2 == 0) {
			product = product * mas[i];
			}
			
		}
		System.out.println(product);
	}

}
