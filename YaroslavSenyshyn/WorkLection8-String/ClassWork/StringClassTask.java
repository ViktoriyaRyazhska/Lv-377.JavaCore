package String;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringClassTask {

	public static void validation(Scanner sc) {
		System.out.println("Pleas input user name for validation");
		String task3 = sc.nextLine();
		
		Pattern p = Pattern.compile("[A-Za-z0-9]{3,15}");
		Matcher m = p.matcher(task3);

		if (m.matches()) {
			System.out.println("Valid");
		} else
			System.out.println("Isn't valid");
	}

	public static void contains(Scanner sc) {
//		String s = new String("IT Academy");
//		String s1 = new String("IT");
		System.out.println("Pleas input first line for check");
		String s = sc.nextLine();
		System.out.println("Pleas input second line for check");
		String s1 = sc.nextLine();

		System.out.println(s.contains(s1));
	}

	public static void output(Scanner sc) {
		System.out.println("Pleas input: surname, name, midle");
		String s = sc.nextLine();
		
		String[] arrayString = s.split(" ");

		System.out.println(arrayString[0] + " " + arrayString[1].charAt(0) + " " + arrayString[2].charAt(0));
		System.out.println(arrayString[1]);
		System.out.println(arrayString[1] + " " + arrayString[2] + " " + arrayString[0]);
/////HandMade-HardCode
//		String surname = new String();
//		String name = new String();
//		String midle = new String();
//		surname = task2.substring(0, task2.indexOf(" "));
//		name = task2.substring(task2.indexOf(" ")+1, task2.lastIndexOf(" "));
//		midle = task2.substring(task2.lastIndexOf(" ")+1, task2.length());
//		System.out.println(surname+" "+name.charAt(0)+" "+midle.charAt(0));
//		System.out.println(name);
//		System.out.println(name+" "+midle+" "+ surname);
	}

}
