package First;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));		
		System.out.println("Input a");
//		int a = sc.nextInt();
		int a = Integer.parseInt(br.readLine());
		System.out.println("Input b");
//		int b = sc.nextInt();
		int b = Integer.parseInt(br.readLine());
		System.out.println("a+b="+(a+b)+" a-b="+(a-b)+" a*b="+a*b+" a/b="+a/b);
//		sc.close();
		br.close();
	}

}
