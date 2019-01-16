package continent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input country");
		String country = bf.readLine();
		switch (country.toLowerCase()) {
		case "ukraine":
		case "italy":
		case "germany":{
			System.out.println(Continent.Europe);
		}		
			break;
		case "argentina":
		case "brasil":
		case "usa":
			System.out.println(Continent.America);
			break;
		case "rasha":
		case "china":
		case "kazahstan":
			System.out.println(Continent.Asia);
			break;
		case "egipt":
		case "somaly":
		case "tunis":
			System.out.println(Continent.Africa);
			break;

		default:
			System.out.println("Error");
			break;
		}

	}

}
