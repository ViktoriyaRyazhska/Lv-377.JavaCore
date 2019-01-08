import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NameAndAddress {

	public static void main(String[] args) throws IOException {
		System.out.println("What is your name?");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
		
		System.out.println("Where do you live, " + name + "?");
		String address = br.readLine();
		System.out.println(name + ", you live in " + address);

	}

}
