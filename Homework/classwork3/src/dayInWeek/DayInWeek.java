package dayInWeek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayInWeek {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input namber day of week");
		int x = Integer.valueOf(br.readLine());
		switch (x) {
		case 1:
			System.out.println("Monday" + ", " + "lundi" + ", " + "Montag");
			break;
		case 2:
			System.out.println("Tuesday" + ", " + "mardi" + ", " + "dienstag");
			break;
		case 3:
			System.out.println("Wednesday" + ", " + "Le mercredi" + ", " + "Mittwoch");
			break;
		case 4:
			System.out.println("Thursday" + ", "+ "Jeudi" + ", " + "Donnerstag");
			break;
		case 5:
			System.out.println("Friday" + ", " + "Vendredi" + ", " + "Freitag");
			break;
		case 6:
			System.out.println("Saturday" + ", " + "samedi" + ", " + "Samstag");
			break;
		case 7:
			System.out.println("Sunday" + ", " + "Le dimanche" + ", " + "Sonntag");
			break;
		default:
			System.out.println("Error");
			break;
		}
	}

}
