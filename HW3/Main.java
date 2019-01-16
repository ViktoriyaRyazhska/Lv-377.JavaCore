package hw2.softserve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//auto input		
		Person pr1 = new Person();
		pr1.setName("Krzhyztof");
		pr1.setBirthYear(1987);
		
		Person pr2 = new Person("Epolit",1965);
		Person pr3 = new Person("Pigidy",2001);
		Person pr4 = new Person("Vahtang mcLoud",1917);
		
		
//output		
		System.out.println(pr1);
		System.out.println(pr2);
		System.out.println(pr3);
		System.out.println(pr4);
	
//manual input		
		Person pr5 = new Person();	
		System.out.print("Enter the person's name: ");
		pr5.setName(br.readLine());
		System.out.println("Enter the person's birth year: ");
        pr5.setBirthYear(Integer.parseInt(br.readLine()));

//change name        
        System.out.print("Please check the person's name, type new or retype it again: ");
		pr5.changePersonsName(br.readLine());

//last output		
		System.out.println(pr5);
		System.out.println(pr1);
		System.out.println(pr2);
		System.out.println(pr3);
		System.out.println(pr4);
		
		
		
	}

}
