package HW4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Write first float number: ");
		float flo1 = Float.parseFloat(br.readLine());
		if (flo1<=5 && flo1>=-5) {
			System.out.println("First float is belong to the range [-5,5]");
		}
		else {
			System.out.println("First float isn't belong to the range [-5,5]");
		}
		System.out.println("Write second float number: ");
		float flo2 = Float.parseFloat(br.readLine());
		if (flo2<=5 && flo2>=-5) {
			System.out.println("Second float is belong to the range [-5,5]");
		}
		else {
			System.out.println("Second float isn't belong to the range [-5,5]");
		}
		System.out.println("Write third float number: ");
		float flo3 = Float.parseFloat(br.readLine());
		if (flo3<=5 && flo3>=-5) {
			System.out.println("Third float is belong to the range [-5,5]");
		}
		else {
			System.out.println("Third float isn't belong to the range [-5,5]");
		}
		
		System.out.println("Write first int number: ");
		int int1 = Integer.parseInt(br.readLine());
		System.out.println("Write second int number: ");
		int int2 = Integer.parseInt(br.readLine());
		System.out.println("Write third int number: ");
		int int3 = Integer.parseInt(br.readLine());
		
		if (int1>int2 && int1>int3) {
			System.out.println("First int is the bigest!");
		}
		else if (int2>int1 && int2>int3) {
			System.out.println("Second int is the bigest!");
		}
		else {
			System.out.println("Third int is the bigest!");
		}
		
		HTTP errHTTP;
		System.out.println("Write error code (400-403): ");
		int err = Integer.parseInt(br.readLine());
		switch (err) {
		case 400:
			errHTTP = HTTP.BadRequest; System.out.println(errHTTP.errorHTTP()); break;
		case 401:
			errHTTP = HTTP.Unauthorized; System.out.println(errHTTP.errorHTTP()); break;
		case 402:
			errHTTP = HTTP.PaymentRequired; System.out.println(errHTTP.errorHTTP()); break;
		case 403:
			errHTTP = HTTP.Forbidden; System.out.println(errHTTP.errorHTTP()); break;
		default:
			System.out.println("Wrong code!"); break;
		}
	}
}