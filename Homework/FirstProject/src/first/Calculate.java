package first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculate {
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("введіть число a :");
		int a = Integer.valueOf(bf.readLine());
		System.out.println("введіть число b :");
		int b = Integer.valueOf(bf.readLine());
		
		System.out.println(a + "+" + b + "=" + (a + b));
		System.out.println(a + "*" + b + "=" + (a * b));
		System.out.println(a + "-" + b + "=" + (a - b));
		System.out.println(a + "/" + b + "=" + (a / b));	
		
		System.out.println("How are you?");
		String st = String.valueOf(bf.readLine());
		System.out.println("My name : " + st);
	}

}
