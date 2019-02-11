package CollectionsGeneric;

import java.util.ArrayList;

public class Task5StudentsMain {

	public static void main(String[] args) {
		
		
		ArrayList<Task5Students> students = new ArrayList<Task5Students>();
		students.add(new Task5Students("Ivan", 1));
		students.add(new Task5Students("Petro", 2));
		students.add(new Task5Students("Ivan", 3));
		students.add(new Task5Students("Vasyl", 5));
		students.add(new Task5Students("Monica", 2));

		Task5Students.printStudentTheSameCourse(students, 2);	
		System.out.println();
		students.sort(new CompareName());
		Task5Students.printAll(students);
		System.out.println();
		students.sort(new CompareCourse());
		Task5Students.printAll(students);
	}
}
