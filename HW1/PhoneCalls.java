import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneCalls {

	public static void main(String[] args) throws NumberFormatException, IOException {
		double c1, c2, c3;
		int t1, t2, t3;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter price for first country");
		c1 = Double.parseDouble(reader.readLine());
		System.out.println("Enter price for second country");
		c2 = Double.parseDouble(reader.readLine());
		System.out.println("Enter price for third country");
		c3 = Double.parseDouble(reader.readLine());
		
		System.out.println("Enter call length for first country");
		t1 = Integer.parseInt(reader.readLine());
		System.out.println("Enter call length for second country");
		t2 = Integer.parseInt(reader.readLine());
		System.out.println("Enter call length for third country");
		t3 = Integer.parseInt(reader.readLine());
		
		System.out.println("c1 * t1 = " + c1*t1);
		System.out.println("c2 * t2 = " + c2*t2);
		System.out.println("c3 * t3 = " + c3*t3);
		System.out.println("c1 * t1 + c2 * t2 + c3 * t3 = " + c1 * t1 + c2 * t2 + c3 * t3);
	}

}
