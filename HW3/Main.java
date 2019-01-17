package HW3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		Person Per1 = new Person();
//		Per1.setName("Dan");
//		Per1.setBirthYear(1990);
//		
//		Person Per2 = new Person("Jo");
//		Per2.setBirthYear(2003);
//		
//		Person Per3 = new Person("Ku", 1945);
//		
//		Person Per4 = new Person();
//		Per4.setName("Lee");
//		Per4.setBirthYear(2008);
//		
//		Person Per5 = new Person("San");
//		Per5.setBirthYear(1991);
		
		Person Per1 = new Person();
		Person Per2 = new Person();
		Person Per3 = new Person();
		Person Per4 = new Person();
		Person Per5 = new Person();
		
		System.out.println("Write name person 1:");
		Per1.setName(br.readLine());
		System.out.println("Write birthday person 1:");
		Per1.setBirthYear(Integer.parseInt(br.readLine()));
		System.out.println("Write name person 2:");
		Per2.setName(br.readLine());
		System.out.println("Write birthday person 2:");
		Per2.setBirthYear(Integer.parseInt(br.readLine()));
		System.out.println("Write name person 3:");
		Per3.setName(br.readLine());
		System.out.println("Write birthday person 3:");
		Per3.setBirthYear(Integer.parseInt(br.readLine()));
		System.out.println("Write name person 4:");
		Per4.setName(br.readLine());
		System.out.println("Write birthday person 4:");
		Per4.setBirthYear(Integer.parseInt(br.readLine()));
		System.out.println("Write name person 5:");
		Per5.setName(br.readLine());
		System.out.println("Write birthday person 5:");
		Per5.setBirthYear(Integer.parseInt(br.readLine()));
	
		System.out.println(Per1);
		System.out.println(Per2);
		System.out.println(Per3);
		System.out.println(Per4);
		System.out.println(Per5);
			
	}
}
