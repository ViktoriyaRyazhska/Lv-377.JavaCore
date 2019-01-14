package person;

import java.awt.im.spi.InputMethod;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		Person person1 = new Person("Vasya", 1980);
		System.out.println("person1 : " + person1);
		person1.changeName();	
		Person person2 = new Person();
		person2.input();	
		Person person3 = new Person();
		person3.input();
		Person person4 = new Person();
		person4.input();
		Person person5 = new Person();
		person5.input();
		
		System.out.println("person1 : " + person1);
		System.out.println("person2 : " + person2);
		System.out.println("person3 : " + person3);
		System.out.println("person4 : " + person4);
		System.out.println("person5 : " + person5);
	}

}
