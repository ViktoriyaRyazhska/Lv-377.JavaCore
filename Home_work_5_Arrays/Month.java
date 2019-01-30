package Home_work_5_Arrays;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {

		// Ask user to enter the number of month.
		// Read the value and write the amount of days in this month (create array with
		// amount days of each month).

		System.out.println("Please, enter the number of month.");
		Scanner sc = new Scanner(System.in);
		int enteredNumberOfMonth = sc.nextInt();

		int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		enteredNumberOfMonth--;

		for (int i = 0; i < monthDays.length; i++) {
			if (enteredNumberOfMonth == i) {
				System.out.println(monthDays[i]);
			} else {
				System.out.println("The wrong number of month");
				break;
			}
		}
		sc.close();
	}

}
