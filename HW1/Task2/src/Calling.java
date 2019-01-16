import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calling {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Call cost per minute in UK?");
		double c1 = Double.parseDouble(br.readLine());
		System.out.println("Call cost per minute in USA?");
		double c2 = Double.parseDouble(br.readLine());
		System.out.println("Call cost per minute in New Zealand?");
		double c3 = Double.parseDouble(br.readLine());
		
		System.out.println("First call duration (mins)?");
		int t1 = Integer.parseInt(br.readLine());
		System.out.println("Second call duration (mins)?");
		int t2 = Integer.parseInt(br.readLine());
		System.out.println("Third call duration (mins)?");
		int t3 = Integer.parseInt(br.readLine());
		
		System.out.println("First call cost: " + c1*t1);
		System.out.println("Second call cost: " + c2*t2);
		System.out.println("Third call call cost: " + c3*t3);
		System.out.println("In total: " + (c1*t1+c2*t2+c3*t3));
		
	}
		

}
