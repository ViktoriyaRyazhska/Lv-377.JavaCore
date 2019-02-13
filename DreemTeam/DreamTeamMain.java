package Chellange;

import java.util.Scanner;
import java.io.BufferedReader;
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
			BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please input number: ");
			int num = 0;
			try {
				num = Integer.parseInt(buf.readLine());
			} catch (NumberFormatException | IOException e) {
				e.printStackTrace();
			}
			for (int i = 1; i <= num; i++) {
				System.out.println(i + ": " + Task01.fibonacci(i));
			}
			break;
		case 2:

			break;
		case 3:

			break;
		case 4:
			System.out.println("Please input some string: ");
			Scanner sc = new Scanner(System.in);
			Task4.calculateNumberLoudLetters(sc);
			break;
		case 5:

			break;
		case 6:
			System.out.println("Please write some text: ");
			Scanner sc = new Scanner(System.in);
			Task6.calculateNumberOfWords(sc);
			break;
		case 7:

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

			break;
		case 13:

			break;
		case 14:

			break;
		default:
			System.out.println("Wrong number!");
			break;
		}
	}
}
