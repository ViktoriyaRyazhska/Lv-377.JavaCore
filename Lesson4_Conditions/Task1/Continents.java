package Lesson4_Conditions.Task1;

import java.util.Scanner;

public class Continents {

	public static void main(String[] args) {

		// Enter the name of the country. Print the name of the continent.
		// (Declare enum with names of continents)

		AllContinents asia = AllContinents.ASIA;
		AllContinents africa = AllContinents.AFRICA;
		AllContinents europe = AllContinents.EUROPE;
		AllContinents northAmerica = AllContinents.NORTHAMERICA;
		AllContinents southAmerica = AllContinents.SOUTHAMERICA;
		AllContinents australia = AllContinents.AUSTRALIA;
		AllContinents antarctica = AllContinents.ANTARCTICA;

		System.out.println("Please, enter the name of a country.");

		Scanner sc = new Scanner(System.in);
		String enteredCountry = sc.nextLine();

		switch (enteredCountry) {
		case "China":
			System.out.println("This country is located on the " + asia.getContinentName() + " continent");
			break;
		case "Tunis":
			System.out.println("This country is located on the " + africa.getContinentName() + " continent");
			break;
		case "The Netherlands":
			System.out.println("This country is located on the " + europe.getContinentName() + " continent");
			break;
		case "USA":
			System.out.println("This country is located on the " + northAmerica.getContinentName() + " continent");
			break;
		case "Peru":
			System.out.println("This country is located on the " + southAmerica.getContinentName() + " continent");
			break;
		case "Australia":
			System.out.println("This country is located on the " + australia.getContinentName() + " continent");
			break;
		case "Antarctica":
			System.out.println("This country is located on the " + antarctica.getContinentName() + " continent");
			break;
		default:
			System.out.println("The wrong country name or entered country isn't in this short list");
			break;
			
		// Як мені зробити так, щоб замість захардкодженої стрінги в кейсі можна поставити значення енаму?
		}

		sc.close();

	}

}
