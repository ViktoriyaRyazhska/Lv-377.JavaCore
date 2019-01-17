package Lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LessonTask1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter variable a: ");
		int a = Integer.parseInt(br.readLine());
		
		System.out.println("Enter variable b: " );
		int b = Integer.parseInt(br.readLine());

		System.out.println("a+b="+(a+b));

		System.out.println("a-b="+(a-b));

		System.out.println("a*b="+(a*b));

		System.out.println("a/b="+(a/b));
		
		System.out.println("How are you?");
		String answer = br.readLine();
		System.out.println("You are "+ answer+"?");
	}

	

}
