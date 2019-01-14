package day2HW;

import java.io.IOException;

public class PersonInfo {

	public static void main(String[] args) throws IOException {
		Person p1 = new Person();
		
		Person p2 = new Person("Vasya", 2010);
		p2.changeName("Ivan");
		System.out.println(p2.getName());
//		Person p3 = new Person();
//		Person p4 = new Person();
	}
}
