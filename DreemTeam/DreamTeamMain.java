package Chellange;

import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;

public class DreamTeamMain {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Write number of task: ");
		int n = 0;
		try {
			n = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		
		switch (n) {
		case 1:	//Fibonacci
			System.out.println("Please input number: ");
			Scanner t1 = new Scanner(System.in);
			int num = 0;
			try {
				num = Integer.parseInt(t1);
			} catch (NumberFormatException | IOException e) {
				e.printStackTrace();
			}
			for (int i = 1; i <= num; i++) {
				System.out.println(i + ": " + Task01.fibonacci(i));
			}
			break;
		case 2:
			System.out.println("Please input some number: ");
			Scanner t2 = new Scanner(System.in);
			Task2.podil(t2);
			break;
		case 3:

			break;
		case 4:
			System.out.println("Please input some string: ");
			Scanner t4 = new Scanner(System.in);
			Task4.calculateNumberLoudLetters(t4);
			break;
		case 5:
			System.out.println("Please input some string: ");
			Scanner t5 = new Scanner(System.in);
			Task5smile.palindrome(t5);
			break;
		case 6:
			System.out.println("Please write some text: ");
			Scanner t6 = new Scanner(System.in);
			Task6.calculateNumberOfWords(t6);
			break;
		case 7:
			Task7.factorial1();
			break;
		case 8:

			break;
		case 9:

			break;
		case 10:

			break;
		case 11:

			break;
		case 12:
			task12.Kratne();
			break;
		case 13:
			Task13.toDivide();
			break;
		case 14:

			break;
		default:
			System.out.println("Wrong number!");
			break;
		}
	}
}
