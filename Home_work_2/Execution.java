package Home_work_1;

public class Execution {

	public static void main(String[] args) {

		Person person1 = new Person("Chrystyna", 1987);
		Person person2 = new Person("Sasha", 1993);
		Person person3 = new Person("Olga", 1983);
		Person person4 = new Person();
		person4.setName("Maria");
		person4.setBirthYear(1990);
		Person person5 = new Person();
		person5.setName("Mykola");
		person5.setBirthYear(1989);

		Person[] array = { person1, person2, person3, person4, person5 };

		for (Person persons : array) {
			System.out.println(persons.toString());
		}
		
		person5.setName("Andrew");
		
		System.out.println("My name was changed to " + person5.getName());

		
	}

}
