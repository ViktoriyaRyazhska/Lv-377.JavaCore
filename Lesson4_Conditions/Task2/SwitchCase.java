package Lesson4_Conditions.Task2;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		// Enter the number of the day of the week. Display the name in three languages.

		Localization localizationMonday = Localization.MON;
		Localization localizationTuesday = Localization.TUE;
		Localization localizationWednesday = Localization.WED;
		Localization localizationThursday = Localization.THU;
		Localization localizationFriday = Localization.FRI;
		Localization localizationSaturday = Localization.SAT;
		Localization localizationSunday = Localization.SUN;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter the number of the day of the week.");
		int enteredNumber = sc.nextInt();

		switch (enteredNumber) {
		case 1:
			System.out.println(
					localizationMonday.getEn() + ", " + localizationMonday.getUa() + ", " + localizationMonday.getPl());
			break;
		case 2:
			System.out.println(localizationTuesday.getEn() + ", " + localizationTuesday.getUa() + ", "
					+ localizationTuesday.getPl());
			break;
		case 3:
			System.out.println(localizationWednesday.getEn() + ", " + localizationWednesday.getUa() + ", "
					+ localizationWednesday.getPl());
			break;
		case 4:
			System.out.println(localizationThursday.getEn() + ", " + localizationThursday.getUa() + ", "
					+ localizationThursday.getPl());
			break;
		case 5:
			System.out.println(
					localizationFriday.getEn() + ", " + localizationFriday.getUa() + ", " + localizationFriday.getPl());
			break;
		case 6:
			System.out.println(localizationSaturday.getEn() + ", " + localizationSaturday.getUa() + ", "
					+ localizationSaturday.getPl());
			break;
		case 7:
			System.out.println(
					localizationSunday.getEn() + ", " + localizationSunday.getUa() + ", " + localizationSunday.getPl());
			break;
		default:
			System.out.println("Entered number is wrong.");
			break;

		}

		sc.close();

		// А як мені написати, що вводити стрінгу не можна,а лише числові значення?
		// Бо коли я вписую слово, то програма ламається.

	}

}
