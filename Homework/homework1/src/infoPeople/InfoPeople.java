package infoPeople;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InfoPeople {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("What is your name?");
		String name = String.valueOf(br.readLine());
		System.out.println("Where are you live, " + name);
		String address = String.valueOf(br.readLine());
		System.out.println(name + " live in " + address);
	}

}
