package person;

public class Main {

	public static void main(String[] args) {
		
		Student st1 = new Student("Vasya", 1);
		Student st2 = new Student("Kolya", 1);
		Student st3 = new Student("Olya", 1);
		Teacher tech1 = new Teacher("Ivan");
		Teacher tech2 = new Teacher("Ira");
		Cleaner cl1 = new Cleaner("Inna");
		Cleaner cl2 = new Cleaner("Petya");
		
		Person[] mas = {st1, st2, st3, tech1, tech2, cl1, cl2};
		for(int i = 0; i < mas.length; i++) {
			System.out.println(mas[i].getName() + " " + mas[i]);
			mas[i].print();	 
			if(mas[i] instanceof Staff) {
				System.out.println(((Staff)mas[i]).salary());
			}
			
		}
	}


}
