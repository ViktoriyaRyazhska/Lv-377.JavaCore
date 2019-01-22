package OOPInheritance;

public class PersonMain extends Person {

	public static void main(String[] args) {
		
		Person[] p = new Person[6];
		p[0] = new Student();
		p[0].setName("Ivan");
		p[1] = new Student();
		p[1].setName("Ira");
		p[2] = new Teacher();
		p[2].setName("Andrij");
		p[3] = new Teacher();
		p[3].setName("Petro");
		p[4] = new Cleaner();
		p[4].setName("Anya");
		p[5] = new Cleaner();
		p[5].setName("Roberto");
		
		for (int i = 0; i < p.length; i++) {
			p[i].print();
			System.out.println();
			if (p[i] instanceof Staff ) {
				((Staff)p[i]).Sallary();
				System.out.println();
				
			}
		}	
		
	}

}
