package Chellange;

import java.util.Scanner;

public class Task11 {
	public static void checkNumberCard(Scanner sc) {
		System.out.println("Info about quantity digits: AmericanExpress-15; Visa & MasterCard-16");
		System.out.println("Pleas input your number");
		String cNum = sc.nextLine();
		int sum = 0;
		boolean revision = false;
	
		if (((cNum.length()==16)&&(cNum.charAt(0)=='5')) 
				||((cNum.length()==16)&&(cNum.charAt(0)=='4')) 
				||((cNum.length()==15&&(cNum.charAt(0)=='3')&&(cNum.charAt(1)=='7')))) {
			switch (cNum.charAt(0)) {
			case '5':
				System.out.print("Visa: ");
				break;
			case '4':
				System.out.print("MasterCard: ");
				break;
			default:
				System.out.print("American Expres: ");
				break;
			}
			
			for (int i = cNum.length() - 1; i >= 0; i--) {
				int number = Integer.parseInt(cNum.substring(i, i + 1));
				if (revision) {
					number *= 2;
					if (number > 9) {
						number = (number % 10) + 1;
					}
				}
				sum += number;
				revision = !revision;
			}
			if (sum % 10 == 0) {
				System.out.println("Credit card number correct. Congratulation!");
			} else {
				System.out.println("you try inpyt, but number incorrect. Input again.");
			}
	} else {
		System.out.println("Incorect quantity or value.");
	}
}
}