package Lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Country {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name of the continent: ");

		String country = br.readLine();

		switch (country) {
		case "Ukraine":
		case "Polland":
		case "Germany":
			System.out.println(Continent.EUROPE);
			break;
		case "China":
		case "Japan":
		case "India":
			System.out.println(Continent.ASIA);
			break;
		case "Usa":
		case "Canada":
		case "Mexica":
			System.out.println(Continent.AMERICA);
			break;

		default:
			System.out.println("No this country");
			System.exit(0);
		}

	}

}

enum Continent {
	ASIA, EUROPE, AMERICA;

}
