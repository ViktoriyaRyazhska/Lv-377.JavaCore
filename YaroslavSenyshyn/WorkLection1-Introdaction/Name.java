package First;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Name {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String name;
		String address;
		
		System.out.println("Hello! What is your name?");
		name = br.readLine();
		System.out.println("Where are you live, "+name+"?");
		address = br.readLine();
		System.out.println(name+" is live in: "+address);
	}

}
