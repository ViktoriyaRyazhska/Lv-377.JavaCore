import java.io.IOException;

public class PersonList {

	public static void main(String[] args) throws Exception, IOException {
		Person person1 = new Person("John", 1984);
		Person person2 = new Person("Sansa", 1986);
		Person person3 = new Person("Arya", 1997);
		Person person4 = new Person("Brandon", 1987);
		Person person5 = new Person("Robb", 1981);
		
				
		person1.input();
		person2.input();
		person3.input();
		person4.input();
		person5.input();
		
		person1.output();
		person2.output();
		person3.output();
		person4.output();
		person5.output();		
		
		person1.changeName();
		person2.changeName();
		person3.changeName();
		person4.changeName();
		person5.changeName();
		
		
		
			}


}
