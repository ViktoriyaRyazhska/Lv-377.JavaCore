package Lesson6;

public class PersonAppl {

	public static void main(String[] args) {

		Person[] person = new Person[4];
		person[0] = new Student("SemenStudent");
		person[1] = new Student("Vasya");
		person[2] = new Cleaner("IvanCleaner");
		person[3] = new Teacher("IvanTeacher");

		for (int i = 0; i < person.length; i++) {
			person[i].print();
			if (person[i] instanceof Staff) {
				((Staff) person[i]).salary();
			}
		}

	}

}
