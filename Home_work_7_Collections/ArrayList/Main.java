package Home_work_7_Collections.ArrayList;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		// In the main() method
		// declare List students and add to the list five different students
		// display the list of students ordered by name
		// display the list of students ordered by course.

		Scanner sc = new Scanner(System.in);

		List<Student> listOfStudents = new ArrayList<Student>();
		listOfStudents.add(new Student("Andrew", 3));
		listOfStudents.add(new Student("Oleg", 4));
		listOfStudents.add(new Student("Sofia", 2));
		listOfStudents.add(new Student("Yaromyr", 1));
		listOfStudents.add(new Student("Bohdan", 4));
		listOfStudents.add(new Student("Anna", 3));

		System.out.println("Please, enter the course.");
		Integer enteredCourse = 0;

		try {
			enteredCourse = sc.nextInt();
			System.out.println(Student.printStudents(listOfStudents, enteredCourse) + "\n");
		} catch (InputMismatchException myString) {
			System.out.println("Entered value is string.");
			myString.printStackTrace();
		} catch (Exception invalidNumber) {
			invalidNumber.printStackTrace();
		}

		listOfStudents.sort(new CompareByName());
		for (Student temporaryVariable : listOfStudents) {
			System.out.println(temporaryVariable);
		}

		listOfStudents.sort(new CompareByCourse());
		for (Student temporaryList : listOfStudents) {
			System.out.println(temporaryList);
		}
		sc.close();
	}

}
