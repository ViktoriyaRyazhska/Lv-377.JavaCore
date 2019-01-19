
public class AgeOfPerson {

	public static void main(String[] args) {
		Person p1 = new Person("Oleg", 1986);
		Person p2 = new Person("Maryna", 1987);
		p2.input("Olezyk", 2000);
		Person p3 = new Person("Vitalik", 1989);
		Person p4 = new Person("Roman", 1988);
		Person p5 = new Person();
		p5.input("Snizhana", 1980);
		p5.changeName("Svitlana");
		
		p1.output();
		p2.output();
		p3.output();
		p4.output();
		p5.output();
		
		System.out.println();

	}

}
