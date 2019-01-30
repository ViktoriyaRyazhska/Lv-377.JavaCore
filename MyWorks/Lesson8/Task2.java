package Lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter surname: ");
		String surname = br.readLine();
		System.out.println("Enter name: ");
		String name = br.readLine();
		System.out.println("Enter patronymic: ");
		String patronymic = br.readLine();
		char c = name.charAt(0);   
		char b = patronymic.charAt(0);   
		System.out.println(surname+" "+c+" "+b);

	}

}

//Enter surname, name and patronymic on the console as a variable of type String. 
//
//Output on the console:
//surnames and initials
//name
//name, middle name and last name
